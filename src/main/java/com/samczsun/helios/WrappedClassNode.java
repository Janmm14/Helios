/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.samczsun.helios;

import org.objectweb.asm.tree.ClassNode;

public class WrappedClassNode {
    private final LoadedFile file;
    private ClassNode classNode;

    public WrappedClassNode(LoadedFile file, ClassNode classNode) {
        this.file = file;
        this.classNode = classNode;
    }

    public ClassNode getClassNode() {
        return this.classNode;
    }

    public void setClassNode(ClassNode newClassNode) {
        this.classNode = newClassNode;
    }

    public LoadedFile getFile() {
        return this.file;
    }
}
