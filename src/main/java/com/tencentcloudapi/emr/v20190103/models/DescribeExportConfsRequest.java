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

public class DescribeExportConfsRequest extends AbstractModel {

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Configuration to be exported.</p>
    */
    @SerializedName("ExportConfContexts")
    @Expose
    private ExportConfContext [] ExportConfContexts;

    /**
    * <p>Export type.</p><p>Enumeration values:</p><ul><li>0: all configurations</li><li>1: only custom and modified configurations</li></ul>
    */
    @SerializedName("ExportType")
    @Expose
    private Long ExportType;

    /**
    * <p>Node IP address.</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Configuration group name.</p>
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Configuration to be exported.</p> 
     * @return ExportConfContexts <p>Configuration to be exported.</p>
     */
    public ExportConfContext [] getExportConfContexts() {
        return this.ExportConfContexts;
    }

    /**
     * Set <p>Configuration to be exported.</p>
     * @param ExportConfContexts <p>Configuration to be exported.</p>
     */
    public void setExportConfContexts(ExportConfContext [] ExportConfContexts) {
        this.ExportConfContexts = ExportConfContexts;
    }

    /**
     * Get <p>Export type.</p><p>Enumeration values:</p><ul><li>0: all configurations</li><li>1: only custom and modified configurations</li></ul> 
     * @return ExportType <p>Export type.</p><p>Enumeration values:</p><ul><li>0: all configurations</li><li>1: only custom and modified configurations</li></ul>
     */
    public Long getExportType() {
        return this.ExportType;
    }

    /**
     * Set <p>Export type.</p><p>Enumeration values:</p><ul><li>0: all configurations</li><li>1: only custom and modified configurations</li></ul>
     * @param ExportType <p>Export type.</p><p>Enumeration values:</p><ul><li>0: all configurations</li><li>1: only custom and modified configurations</li></ul>
     */
    public void setExportType(Long ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get <p>Node IP address.</p> 
     * @return Ip <p>Node IP address.</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>Node IP address.</p>
     * @param Ip <p>Node IP address.</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Configuration group name.</p> 
     * @return ConfGroupName <p>Configuration group name.</p>
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set <p>Configuration group name.</p>
     * @param ConfGroupName <p>Configuration group name.</p>
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    public DescribeExportConfsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportConfsRequest(DescribeExportConfsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExportConfContexts != null) {
            this.ExportConfContexts = new ExportConfContext[source.ExportConfContexts.length];
            for (int i = 0; i < source.ExportConfContexts.length; i++) {
                this.ExportConfContexts[i] = new ExportConfContext(source.ExportConfContexts[i]);
            }
        }
        if (source.ExportType != null) {
            this.ExportType = new Long(source.ExportType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "ExportConfContexts.", this.ExportConfContexts);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);

    }
}

