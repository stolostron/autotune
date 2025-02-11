/*******************************************************************************
 * Copyright (c) 2023 Red Hat, IBM Corporation and others.
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
package com.autotune.analyzer.serviceObjects;


import com.autotune.common.data.metrics.MetricResults;
import com.google.gson.annotations.SerializedName;

public class ContainerMetricsHelper {
    public String name;
    @SerializedName("results")
    public MetricResults metricResults;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricResults getMetricResults() {
        return metricResults;
    }

    public void setMetricResults(MetricResults metricResults) {
        this.metricResults = metricResults;
    }
    @Override
    public String toString() {
        return "ContainerMetricsHelper{" +
                "name='" + name + '\'' +
                ", metricResults=" + metricResults +
                '}';
    }
}
