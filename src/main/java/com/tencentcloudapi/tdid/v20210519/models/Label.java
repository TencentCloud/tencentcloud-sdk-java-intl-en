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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel {

    /**
    * The label ID.
    */
    @SerializedName("LabelId")
    @Expose
    private Long LabelId;

    /**
    * The label name.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * The number of DIDs.
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
    * The DID of the creator.
    */
    @SerializedName("Did")
    @Expose
    private String Did;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The group ID.
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
     * Get The label ID. 
     * @return LabelId The label ID.
     */
    public Long getLabelId() {
        return this.LabelId;
    }

    /**
     * Set The label ID.
     * @param LabelId The label ID.
     */
    public void setLabelId(Long LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get The label name. 
     * @return LabelName The label name.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set The label name.
     * @param LabelName The label name.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get The number of DIDs. 
     * @return DidCount The number of DIDs.
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set The number of DIDs.
     * @param DidCount The number of DIDs.
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    /**
     * Get The DID of the creator. 
     * @return Did The DID of the creator.
     */
    public String getDid() {
        return this.Did;
    }

    /**
     * Set The DID of the creator.
     * @param Did The DID of the creator.
     */
    public void setDid(String Did) {
        this.Did = Did;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The group ID. 
     * @return GroupId The group ID.
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set The group ID.
     * @param GroupId The group ID.
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.LabelId != null) {
            this.LabelId = new Long(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
        if (source.Did != null) {
            this.Did = new String(source.Did);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);
        this.setParamSimple(map, prefix + "Did", this.Did);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

