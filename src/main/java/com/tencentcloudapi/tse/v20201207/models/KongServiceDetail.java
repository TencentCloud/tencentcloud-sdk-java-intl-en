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

public class KongServiceDetail extends AbstractModel {

    /**
    * service ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Service name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Backend protocol
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Backend path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Backend delay in milliseconds
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * Number of retries.
    */
    @SerializedName("Retries")
    @Expose
    private Long Retries;

    /**
    * Tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * backend configuration
    */
    @SerializedName("UpstreamInfo")
    @Expose
    private KongUpstreamInfo UpstreamInfo;

    /**
    * Backend type
    */
    @SerializedName("UpstreamType")
    @Expose
    private String UpstreamType;

    /**
    * Whether it is editable.
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get service ID 
     * @return ID service ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set service ID
     * @param ID service ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Service name. 
     * @return Name Service name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Service name.
     * @param Name Service name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Backend protocol 
     * @return Protocol Backend protocol
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Backend protocol
     * @param Protocol Backend protocol
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Backend path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Backend path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Backend path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Backend path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Backend delay in milliseconds 
     * @return Timeout Backend delay in milliseconds
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set Backend delay in milliseconds
     * @param Timeout Backend delay in milliseconds
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get Number of retries. 
     * @return Retries Number of retries.
     */
    public Long getRetries() {
        return this.Retries;
    }

    /**
     * Set Number of retries.
     * @param Retries Number of retries.
     */
    public void setRetries(Long Retries) {
        this.Retries = Retries;
    }

    /**
     * Get Tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get backend configuration 
     * @return UpstreamInfo backend configuration
     */
    public KongUpstreamInfo getUpstreamInfo() {
        return this.UpstreamInfo;
    }

    /**
     * Set backend configuration
     * @param UpstreamInfo backend configuration
     */
    public void setUpstreamInfo(KongUpstreamInfo UpstreamInfo) {
        this.UpstreamInfo = UpstreamInfo;
    }

    /**
     * Get Backend type 
     * @return UpstreamType Backend type
     */
    public String getUpstreamType() {
        return this.UpstreamType;
    }

    /**
     * Set Backend type
     * @param UpstreamType Backend type
     */
    public void setUpstreamType(String UpstreamType) {
        this.UpstreamType = UpstreamType;
    }

    /**
     * Get Whether it is editable. 
     * @return Editable Whether it is editable.
     */
    public Boolean getEditable() {
        return this.Editable;
    }

    /**
     * Set Whether it is editable.
     * @param Editable Whether it is editable.
     */
    public void setEditable(Boolean Editable) {
        this.Editable = Editable;
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

    public KongServiceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongServiceDetail(KongServiceDetail source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.Retries != null) {
            this.Retries = new Long(source.Retries);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.UpstreamInfo != null) {
            this.UpstreamInfo = new KongUpstreamInfo(source.UpstreamInfo);
        }
        if (source.UpstreamType != null) {
            this.UpstreamType = new String(source.UpstreamType);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "Retries", this.Retries);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

