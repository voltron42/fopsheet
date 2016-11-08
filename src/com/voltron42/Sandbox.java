package com.voltron42;

import com.voltron42.fopprocessor.Processor;

import java.io.File;

public class Sandbox {

    public static void main(String[] args) {
        try {
            System.out.println("FOP ExampleXML2PDF\n");
            System.out.println("Preparing...");

            // Setup directories
            File baseDir = new File("resources");
            File outDir = new File(baseDir, "out");
            outDir.mkdirs();

            // Setup input and output files
            File xmlfile = new File(baseDir, "projectteam.xml");
            File xsltfile = new File(baseDir, "projectteam2fo.xsl");
            File pdffile = new File(outDir, "ResultXML2PDF.pdf");

            System.out.println("Input: XML (" + xmlfile + ")");
            System.out.println("Stylesheet: " + xsltfile);
            System.out.println("Output: PDF (" + pdffile + ")");
            System.out.println();
            System.out.println("Transforming...");

            Processor processor = new Processor.Builder().build();

            processor.xslToPdf(xmlfile, xsltfile, pdffile);

            System.out.println("Success!");
        } catch (Exception e) {
            e.printStackTrace(System.err);
            System.exit(-1);
        }
    }
}