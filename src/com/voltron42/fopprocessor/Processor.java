package com.voltron42.fopprocessor;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.xmlgraphics.util.MimeConstants;

import javax.xml.transform.*;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/**
 * Created by Daniel.Johnson on 11/4/2016.
 */
public class Processor {

    public static class Builder {
        private File cwd;

        public Builder() {
            cwd = new File("");
        }

        public File getCwd() {
            return cwd;
        }

        public Builder setCwd(File cwd) {
            this.cwd = cwd;
            return this;
        }

        public Processor build() {
            return new Processor(cwd);
        }
    }

    private final FopFactory fopFactory;
    private final FOUserAgent foUserAgent;

    private Processor(File cwd) {
        fopFactory = FopFactory.newInstance(cwd.toURI());
        foUserAgent = fopFactory.newFOUserAgent();
    }

    public void foToPdf(File fo, File pdf) throws IOException, FOPException, TransformerException {

        OutputStream out = new BufferedOutputStream(new FileOutputStream(pdf));

        try {
            // Step 3: Construct fop with desired output format
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, out);

            // Step 4: Setup JAXP using identity transformer
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(); // identity transformer

            // Step 5: Setup input and output for XSLT transformation
            // Setup input stream
            Source src = new StreamSource(fo);

            // Resulting SAX events (the generated FO) must be piped through to FOP
            Result res = new SAXResult(fop.getDefaultHandler());

            // Step 6: Start XSLT transformation and FOP processing
            transformer.transform(src, res);

        } finally {
            //Clean-up
            out.close();
        }
    }

    public void xslToPdf(File xml, File xslt, File pdf) throws IOException, FOPException, TransformerException {
        // Setup output
        OutputStream out = new FileOutputStream(pdf);
        out = new java.io.BufferedOutputStream(out);

        try {
            // Construct fop with desired output format
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

            // Setup XSLT
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xslt));

            // Set the value of a <param> in the stylesheet
            transformer.setParameter("versionParam", "2.0");

            // Setup input for XSLT transformation
            Source src = new StreamSource(xml);

            // Resulting SAX events (the generated FO) must be piped through to FOP
            Result res = new SAXResult(fop.getDefaultHandler());

            // Start XSLT transformation and FOP processing
            transformer.transform(src, res);
        } finally {
            out.close();
        }
    }
}