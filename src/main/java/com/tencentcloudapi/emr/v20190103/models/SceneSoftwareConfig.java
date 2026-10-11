/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
 */
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SceneSoftwareConfig extends AbstractModel {

    /**
    * List of deployed components. Different EMR product versions (ProductVersion) have different optional component lists. For details about how to query the optional component lists for different product versions, see [Component Version](https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1).
Example values: hive and flink.
    */
    @SerializedName("Software")
    @Expose
    private String [] Software;

    /**
    * Default Hadoop-Default. For details about the scenario-based values, see [Scenario Query](https://www.tencentcloud.com/document/product/589/14624?from_cn_redirect=1):
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
Hadoop-Default
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
     * Get List of deployed components. Different EMR product versions (ProductVersion) have different optional component lists. For details about how to query the optional component lists for different product versions, see [Component Version](https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1).
Example values: hive and flink. 
     * @return Software List of deployed components. Different EMR product versions (ProductVersion) have different optional component lists. For details about how to query the optional component lists for different product versions, see [Component Version](https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1).
Example values: hive and flink.
     */
    public String [] getSoftware() {
        return this.Software;
    }

    /**
     * Set List of deployed components. Different EMR product versions (ProductVersion) have different optional component lists. For details about how to query the optional component lists for different product versions, see [Component Version](https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1).
Example values: hive and flink.
     * @param Software List of deployed components. Different EMR product versions (ProductVersion) have different optional component lists. For details about how to query the optional component lists for different product versions, see [Component Version](https://www.tencentcloud.com/document/product/589/20279?from_cn_redirect=1).
Example values: hive and flink.
     */
    public void setSoftware(String [] Software) {
        this.Software = Software;
    }

    /**
     * Get Default Hadoop-Default. For details about the scenario-based values, see [Scenario Query](https://www.tencentcloud.com/document/product/589/14624?from_cn_redirect=1):
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
Hadoop-Default 
     * @return SceneName Default Hadoop-Default. For details about the scenario-based values, see [Scenario Query](https://www.tencentcloud.com/document/product/589/14624?from_cn_redirect=1):
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
Hadoop-Default
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set Default Hadoop-Default. For details about the scenario-based values, see [Scenario Query](https://www.tencentcloud.com/document/product/589/14624?from_cn_redirect=1):
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
Hadoop-Default
     * @param SceneName Default Hadoop-Default. For details about the scenario-based values, see [Scenario Query](https://www.tencentcloud.com/document/product/589/14624?from_cn_redirect=1):
Hadoop-Kudu
Hadoop-Zookeeper
Hadoop-Presto
Hadoop-Hbase
Hadoop-Default
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    public SceneSoftwareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SceneSoftwareConfig(SceneSoftwareConfig source) {
        if (source.Software != null) {
            this.Software = new String[source.Software.length];
            for (int i = 0; i < source.Software.length; i++) {
                this.Software[i] = new String(source.Software[i]);
            }
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Software.", this.Software);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);

    }
}

