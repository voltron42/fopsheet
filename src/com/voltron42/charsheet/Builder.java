package com.voltron42.charsheet;

import com.voltron42.fopprocessor.Processor;
import org.apache.fop.apps.FOPException;

import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

/**
 * Created by daniel.johnson on 11/8/2016.
 */
public class Builder {

    public static void main(String[] args) throws TransformerException, IOException, FOPException {
        File basedir = new File("resources/charsheet/fo");
        basedir.mkdirs();
        File outdir = new File("resources/charsheet/out");
        outdir.mkdirs();

        File fo = new File(basedir, "charsheet.fo");
        File outFile = new File(outdir, "charsheet.pdf");

        Processor.Builder builder = new Processor.Builder();
        Processor processor = builder.setCwd(basedir).build();

        processor.foToPdf(fo, outFile);

    }
}
