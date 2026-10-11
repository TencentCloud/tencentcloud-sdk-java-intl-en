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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonTagInfo extends AbstractModel {

    /**
    * Tag ID
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * Tag name.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Tag value ID. For property tags (LabelType=3), it can be 0.
    */
    @SerializedName("LabelValueId")
    @Expose
    private String LabelValueId;

    /**
    * Tag value. It can be empty for a masking tag (LabelType=4).
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
    * Tag type. For valid values, see the LabelType enum definition: 1 - governance tag, 2 - custom tag, 3 - property tag, 4 - masking tag.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Whether the tag has been deleted. true indicates that no record of this LabelId is found in meta_biz_label and the tag has been physically deleted; false (default) indicates that the tag still exists.
    */
    @SerializedName("Deleted")
    @Expose
    private Boolean Deleted;

    /**
     * Get Tag ID 
     * @return LabelId Tag ID
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set Tag ID
     * @param LabelId Tag ID
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get Tag name. 
     * @return LabelName Tag name.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Tag name.
     * @param LabelName Tag name.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Tag value ID. For property tags (LabelType=3), it can be 0. 
     * @return LabelValueId Tag value ID. For property tags (LabelType=3), it can be 0.
     */
    public String getLabelValueId() {
        return this.LabelValueId;
    }

    /**
     * Set Tag value ID. For property tags (LabelType=3), it can be 0.
     * @param LabelValueId Tag value ID. For property tags (LabelType=3), it can be 0.
     */
    public void setLabelValueId(String LabelValueId) {
        this.LabelValueId = LabelValueId;
    }

    /**
     * Get Tag value. It can be empty for a masking tag (LabelType=4). 
     * @return LabelValue Tag value. It can be empty for a masking tag (LabelType=4).
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Tag value. It can be empty for a masking tag (LabelType=4).
     * @param LabelValue Tag value. It can be empty for a masking tag (LabelType=4).
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    /**
     * Get Tag type. For valid values, see the LabelType enum definition: 1 - governance tag, 2 - custom tag, 3 - property tag, 4 - masking tag. 
     * @return Type Tag type. For valid values, see the LabelType enum definition: 1 - governance tag, 2 - custom tag, 3 - property tag, 4 - masking tag.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Tag type. For valid values, see the LabelType enum definition: 1 - governance tag, 2 - custom tag, 3 - property tag, 4 - masking tag.
     * @param Type Tag type. For valid values, see the LabelType enum definition: 1 - governance tag, 2 - custom tag, 3 - property tag, 4 - masking tag.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Whether the tag has been deleted. true indicates that no record of this LabelId is found in meta_biz_label and the tag has been physically deleted; false (default) indicates that the tag still exists. 
     * @return Deleted Whether the tag has been deleted. true indicates that no record of this LabelId is found in meta_biz_label and the tag has been physically deleted; false (default) indicates that the tag still exists.
     */
    public Boolean getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the tag has been deleted. true indicates that no record of this LabelId is found in meta_biz_label and the tag has been physically deleted; false (default) indicates that the tag still exists.
     * @param Deleted Whether the tag has been deleted. true indicates that no record of this LabelId is found in meta_biz_label and the tag has been physically deleted; false (default) indicates that the tag still exists.
     */
    public void setDeleted(Boolean Deleted) {
        this.Deleted = Deleted;
    }

    public CommonTagInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonTagInfo(CommonTagInfo source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValueId != null) {
            this.LabelValueId = new String(source.LabelValueId);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Deleted != null) {
            this.Deleted = new Boolean(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValueId", this.LabelValueId);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

