package com.samczsun.helios.gui;

import com.samczsun.helios.transformers.Transformer;
import org.eclipse.swt.custom.CTabItem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ClassData {
    private final String file;

    private final String className;

    private volatile CTabItem fileTab;

    private final Map<Transformer, ClassTransformationData> transformers = Collections.synchronizedMap(new HashMap<>());

    ClassData(String file, String className) {
        this.file = file;
        this.className = className;
    }

    public ClassTransformationData open(Transformer transformer) {
        return this.transformers.computeIfAbsent(transformer, t -> new ClassTransformationData());
    }

    public boolean hasOpen(Transformer transformer) {
        return this.transformers.containsKey(transformer);
    }

    public void close(Transformer transformer) {
        this.transformers.remove(transformer);
    }

    public CTabItem getFileTab() {
        return fileTab;
    }

    public void setFileTab(CTabItem fileTab) {
        this.fileTab = fileTab;
    }

    public String getFileName() {
        return file;
    }

    public String getClassName() {
        return className;
    }
}
