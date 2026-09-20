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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSamplePerson extends AbstractModel {

    /**
    * <p>Figure ID.</p>
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * <p>Figure name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Character description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Face information.</p>
    */
    @SerializedName("FaceInfoSet")
    @Expose
    private AiSampleFaceInfo [] FaceInfoSet;

    /**
    * <p>Figure tag.</p>
    */
    @SerializedName("TagSet")
    @Expose
    private String [] TagSet;

    /**
    * <p>Application scenarios.</p>
    */
    @SerializedName("UsageSet")
    @Expose
    private String [] UsageSet;

    /**
    * <p>Creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>Figure ID.</p> 
     * @return PersonId <p>Figure ID.</p>
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set <p>Figure ID.</p>
     * @param PersonId <p>Figure ID.</p>
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get <p>Figure name.</p> 
     * @return Name <p>Figure name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Figure name.</p>
     * @param Name <p>Figure name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Character description.</p> 
     * @return Description <p>Character description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Character description.</p>
     * @param Description <p>Character description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Face information.</p> 
     * @return FaceInfoSet <p>Face information.</p>
     */
    public AiSampleFaceInfo [] getFaceInfoSet() {
        return this.FaceInfoSet;
    }

    /**
     * Set <p>Face information.</p>
     * @param FaceInfoSet <p>Face information.</p>
     */
    public void setFaceInfoSet(AiSampleFaceInfo [] FaceInfoSet) {
        this.FaceInfoSet = FaceInfoSet;
    }

    /**
     * Get <p>Figure tag.</p> 
     * @return TagSet <p>Figure tag.</p>
     */
    public String [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>Figure tag.</p>
     * @param TagSet <p>Figure tag.</p>
     */
    public void setTagSet(String [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get <p>Application scenarios.</p> 
     * @return UsageSet <p>Application scenarios.</p>
     */
    public String [] getUsageSet() {
        return this.UsageSet;
    }

    /**
     * Set <p>Application scenarios.</p>
     * @param UsageSet <p>Application scenarios.</p>
     */
    public void setUsageSet(String [] UsageSet) {
        this.UsageSet = UsageSet;
    }

    /**
     * Get <p>Creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Last modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AiSamplePerson() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiSamplePerson(AiSamplePerson source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.FaceInfoSet != null) {
            this.FaceInfoSet = new AiSampleFaceInfo[source.FaceInfoSet.length];
            for (int i = 0; i < source.FaceInfoSet.length; i++) {
                this.FaceInfoSet[i] = new AiSampleFaceInfo(source.FaceInfoSet[i]);
            }
        }
        if (source.TagSet != null) {
            this.TagSet = new String[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new String(source.TagSet[i]);
            }
        }
        if (source.UsageSet != null) {
            this.UsageSet = new String[source.UsageSet.length];
            for (int i = 0; i < source.UsageSet.length; i++) {
                this.UsageSet[i] = new String(source.UsageSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "FaceInfoSet.", this.FaceInfoSet);
        this.setParamArraySimple(map, prefix + "TagSet.", this.TagSet);
        this.setParamArraySimple(map, prefix + "UsageSet.", this.UsageSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

