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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KongTarget extends AbstractModel {

    /**
    * Host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Weight
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Health status.
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Source of the Target
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * CVM instance ID
    */
    @SerializedName("CvmInstanceId")
    @Expose
    private String CvmInstanceId;

    /**
    * CVM instance name.
    */
    @SerializedName("CvmInstanceName")
    @Expose
    private String CvmInstanceName;

    /**
    * target tag
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get Host 
     * @return Host Host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host
     * @param Host Host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Port. 
     * @return Port Port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port.
     * @param Port Port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Weight 
     * @return Weight Weight
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Weight
     * @param Weight Weight
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Health status. 
     * @return Health Health status.
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set Health status.
     * @param Health Health status.
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Source of the Target 
     * @return Source Source of the Target
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set Source of the Target
     * @param Source Source of the Target
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get CVM instance ID 
     * @return CvmInstanceId CVM instance ID
     */
    public String getCvmInstanceId() {
        return this.CvmInstanceId;
    }

    /**
     * Set CVM instance ID
     * @param CvmInstanceId CVM instance ID
     */
    public void setCvmInstanceId(String CvmInstanceId) {
        this.CvmInstanceId = CvmInstanceId;
    }

    /**
     * Get CVM instance name. 
     * @return CvmInstanceName CVM instance name.
     */
    public String getCvmInstanceName() {
        return this.CvmInstanceName;
    }

    /**
     * Set CVM instance name.
     * @param CvmInstanceName CVM instance name.
     */
    public void setCvmInstanceName(String CvmInstanceName) {
        this.CvmInstanceName = CvmInstanceName;
    }

    /**
     * Get target tag 
     * @return Tags target tag
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set target tag
     * @param Tags target tag
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public KongTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongTarget(KongTarget source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.CvmInstanceId != null) {
            this.CvmInstanceId = new String(source.CvmInstanceId);
        }
        if (source.CvmInstanceName != null) {
            this.CvmInstanceName = new String(source.CvmInstanceName);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "CvmInstanceId", this.CvmInstanceId);
        this.setParamSimple(map, prefix + "CvmInstanceName", this.CvmInstanceName);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

