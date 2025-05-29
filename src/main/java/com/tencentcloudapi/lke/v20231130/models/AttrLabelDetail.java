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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttrLabelDetail extends AbstractModel {

    /**
    * Label ID.
    */
    @SerializedName("AttrBizId")
    @Expose
    private String AttrBizId;

    /**
    * Label identification.
    */
    @SerializedName("AttrKey")
    @Expose
    private String AttrKey;

    /**
    * Label name.
    */
    @SerializedName("AttrName")
    @Expose
    private String AttrName;

    /**
    * Label value name.
    */
    @SerializedName("LabelNames")
    @Expose
    private String [] LabelNames;

    /**
    * Whether the label is being updated.
    */
    @SerializedName("IsUpdating")
    @Expose
    private Boolean IsUpdating;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Status description.
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * Total number of label values.
    */
    @SerializedName("LabelTotalCount")
    @Expose
    private String LabelTotalCount;

    /**
     * Get Label ID. 
     * @return AttrBizId Label ID.
     */
    public String getAttrBizId() {
        return this.AttrBizId;
    }

    /**
     * Set Label ID.
     * @param AttrBizId Label ID.
     */
    public void setAttrBizId(String AttrBizId) {
        this.AttrBizId = AttrBizId;
    }

    /**
     * Get Label identification. 
     * @return AttrKey Label identification.
     */
    public String getAttrKey() {
        return this.AttrKey;
    }

    /**
     * Set Label identification.
     * @param AttrKey Label identification.
     */
    public void setAttrKey(String AttrKey) {
        this.AttrKey = AttrKey;
    }

    /**
     * Get Label name. 
     * @return AttrName Label name.
     */
    public String getAttrName() {
        return this.AttrName;
    }

    /**
     * Set Label name.
     * @param AttrName Label name.
     */
    public void setAttrName(String AttrName) {
        this.AttrName = AttrName;
    }

    /**
     * Get Label value name. 
     * @return LabelNames Label value name.
     */
    public String [] getLabelNames() {
        return this.LabelNames;
    }

    /**
     * Set Label value name.
     * @param LabelNames Label value name.
     */
    public void setLabelNames(String [] LabelNames) {
        this.LabelNames = LabelNames;
    }

    /**
     * Get Whether the label is being updated. 
     * @return IsUpdating Whether the label is being updated.
     */
    public Boolean getIsUpdating() {
        return this.IsUpdating;
    }

    /**
     * Set Whether the label is being updated.
     * @param IsUpdating Whether the label is being updated.
     */
    public void setIsUpdating(Boolean IsUpdating) {
        this.IsUpdating = IsUpdating;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Status description. 
     * @return StatusDesc Status description.
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set Status description.
     * @param StatusDesc Status description.
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get Total number of label values. 
     * @return LabelTotalCount Total number of label values.
     */
    public String getLabelTotalCount() {
        return this.LabelTotalCount;
    }

    /**
     * Set Total number of label values.
     * @param LabelTotalCount Total number of label values.
     */
    public void setLabelTotalCount(String LabelTotalCount) {
        this.LabelTotalCount = LabelTotalCount;
    }

    public AttrLabelDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttrLabelDetail(AttrLabelDetail source) {
        if (source.AttrBizId != null) {
            this.AttrBizId = new String(source.AttrBizId);
        }
        if (source.AttrKey != null) {
            this.AttrKey = new String(source.AttrKey);
        }
        if (source.AttrName != null) {
            this.AttrName = new String(source.AttrName);
        }
        if (source.LabelNames != null) {
            this.LabelNames = new String[source.LabelNames.length];
            for (int i = 0; i < source.LabelNames.length; i++) {
                this.LabelNames[i] = new String(source.LabelNames[i]);
            }
        }
        if (source.IsUpdating != null) {
            this.IsUpdating = new Boolean(source.IsUpdating);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.LabelTotalCount != null) {
            this.LabelTotalCount = new String(source.LabelTotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttrBizId", this.AttrBizId);
        this.setParamSimple(map, prefix + "AttrKey", this.AttrKey);
        this.setParamSimple(map, prefix + "AttrName", this.AttrName);
        this.setParamArraySimple(map, prefix + "LabelNames.", this.LabelNames);
        this.setParamSimple(map, prefix + "IsUpdating", this.IsUpdating);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "LabelTotalCount", this.LabelTotalCount);

    }
}

