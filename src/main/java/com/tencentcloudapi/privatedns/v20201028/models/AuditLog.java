/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLog extends AbstractModel{

    /**
    * Log type
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Log table name
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * Total number of logs
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List of logs
    */
    @SerializedName("DataSet")
    @Expose
    private AuditLogInfo [] DataSet;

    /**
     * Get Log type 
     * @return Resource Log type
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Log type
     * @param Resource Log type
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Log table name 
     * @return Metric Log table name
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set Log table name
     * @param Metric Log table name
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get Total number of logs 
     * @return TotalCount Total number of logs
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of logs
     * @param TotalCount Total number of logs
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List of logs 
     * @return DataSet List of logs
     */
    public AuditLogInfo [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set List of logs
     * @param DataSet List of logs
     */
    public void setDataSet(AuditLogInfo [] DataSet) {
        this.DataSet = DataSet;
    }

    public AuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLog(AuditLog source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataSet != null) {
            this.DataSet = new AuditLogInfo[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new AuditLogInfo(source.DataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);

    }
}

