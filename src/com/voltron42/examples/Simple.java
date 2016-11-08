package com.voltron42.examples;

import com.voltron42.fopprocessor.Processor;

import java.io.File;

/**
 * Created by Daniel.Johnson on 11/4/2016.
 */
public class Simple {

    private static String[] subdirs = new String[]{
        /*
        "advanced",
        "basic",
        "footnotes",
        "keeps_and_breaks",
        "markers",
        "pagination",
        "region_body",
        "tables",
        */
        "svg"
    };

    public static void main(String[] args) {
        Processor.Builder builder = new Processor.Builder();
        String dir = "examples";
        File baseDir = new File("resources");
        File outDir = new File(baseDir, "out");
        baseDir = new File(baseDir, dir);
        outDir = new File(outDir, dir);
        outDir.mkdirs();

        for (String subdir : subdirs) {
            File subBaseDir = new File(baseDir, subdir);
            File subOutDir = new File(outDir, subdir);
            subOutDir.mkdirs();

            Processor processor = builder.setCwd(subBaseDir).build();

            for (File fo : subBaseDir.listFiles()) {
                String foName = fo.getName();
                if (foName.indexOf(".fo") > -1) {
                    String outFileName = foName.replace(".fo", ".pdf");
                    File outFile = new File(subOutDir, outFileName);
                    try {
                        processor.foToPdf(fo, outFile);
                    } catch (Exception e) {
                        System.out.print("error with " + outFileName);
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
