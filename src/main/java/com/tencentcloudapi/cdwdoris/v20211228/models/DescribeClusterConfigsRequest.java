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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClusterConfigsRequest extends AbstractModel {

    /**
    * Cluster instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 0 indicates public cloud query, and 1 Qinge query. Qinge query shows all that needs to be displayed.
    */
    @SerializedName("ConfigType")
    @Expose
    private Long ConfigType;

    /**
    * Search for files with fuzzy keywords
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 0 indicates cluster dimension and 1 node dimension
    */
    @SerializedName("ClusterConfigType")
    @Expose
    private Long ClusterConfigType;

    /**
    * eth0's IP address
    */
    @SerializedName("IPAddress")
    @Expose
    private String IPAddress;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 0 indicates public cloud query, and 1 Qinge query. Qinge query shows all that needs to be displayed. 
     * @return ConfigType 0 indicates public cloud query, and 1 Qinge query. Qinge query shows all that needs to be displayed.
     */
    public Long getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 0 indicates public cloud query, and 1 Qinge query. Qinge query shows all that needs to be displayed.
     * @param ConfigType 0 indicates public cloud query, and 1 Qinge query. Qinge query shows all that needs to be displayed.
     */
    public void setConfigType(Long ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get Search for files with fuzzy keywords 
     * @return FileName Search for files with fuzzy keywords
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Search for files with fuzzy keywords
     * @param FileName Search for files with fuzzy keywords
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 0 indicates cluster dimension and 1 node dimension 
     * @return ClusterConfigType 0 indicates cluster dimension and 1 node dimension
     */
    public Long getClusterConfigType() {
        return this.ClusterConfigType;
    }

    /**
     * Set 0 indicates cluster dimension and 1 node dimension
     * @param ClusterConfigType 0 indicates cluster dimension and 1 node dimension
     */
    public void setClusterConfigType(Long ClusterConfigType) {
        this.ClusterConfigType = ClusterConfigType;
    }

    /**
     * Get eth0's IP address 
     * @return IPAddress eth0's IP address
     */
    public String getIPAddress() {
        return this.IPAddress;
    }

    /**
     * Set eth0's IP address
     * @param IPAddress eth0's IP address
     */
    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public DescribeClusterConfigsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClusterConfigsRequest(DescribeClusterConfigsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new Long(source.ConfigType);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.ClusterConfigType != null) {
            this.ClusterConfigType = new Long(source.ClusterConfigType);
        }
        if (source.IPAddress != null) {
            this.IPAddress = new String(source.IPAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "ClusterConfigType", this.ClusterConfigType);
        this.setParamSimple(map, prefix + "IPAddress", this.IPAddress);

    }
}

