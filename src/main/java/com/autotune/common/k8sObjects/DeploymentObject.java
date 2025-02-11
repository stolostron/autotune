/*******************************************************************************
 * Copyright (c) 2022 Red Hat, IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.autotune.common.k8sObjects;

import com.autotune.analyzer.utils.AnalyzerConstants;

import java.util.HashMap;

public class DeploymentObject {
    private String name;
    private String namespace;
    private AnalyzerConstants.K8S_OBJECT_TYPES type;
    private HashMap<String, ContainerObject> containers;

    public DeploymentObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, ContainerObject> getContainers() {
        return containers;
    }

    public void setContainers(HashMap<String, ContainerObject> containers) {
        this.containers = containers;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public AnalyzerConstants.K8S_OBJECT_TYPES getType() {
        return type;
    }

    public void setType(AnalyzerConstants.K8S_OBJECT_TYPES type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DeploymentObject{" +
                "name='" + name + '\'' +
                ", containers=" + containers +
                '}';
    }
}
