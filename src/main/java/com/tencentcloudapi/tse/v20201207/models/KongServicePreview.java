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

public class KongServicePreview extends AbstractModel {

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
    * Tag.
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
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Whether it is editable.
    */
    @SerializedName("Editable")
    @Expose
    private Boolean Editable;

    /**
    * request path
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

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
     * Get Tag. 
     * @return Tags Tag.
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag.
     * @param Tags Tag.
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
     * Get request path
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path request path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set request path
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path request path
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public KongServicePreview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KongServicePreview(KongServicePreview source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Editable != null) {
            this.Editable = new Boolean(source.Editable);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "UpstreamInfo.", this.UpstreamInfo);
        this.setParamSimple(map, prefix + "UpstreamType", this.UpstreamType);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Editable", this.Editable);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

