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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlTemplate extends AbstractModel {

    /**
    * Unique identifier of a media quality inspection template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Media quality inspection template name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description.


Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Media quality inspection configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("QualityControlItemSet")
    @Expose
    private QualityControlItemConfig [] QualityControlItemSet;

    /**
    * Creation time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Unique identifier of a media quality inspection template. 
     * @return Definition Unique identifier of a media quality inspection template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of a media quality inspection template.
     * @param Definition Unique identifier of a media quality inspection template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Media quality inspection template name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Media quality inspection template name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media quality inspection template name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Media quality inspection template name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description.


Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Comment Template description.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description.


Note: This field may return null, indicating that no valid values can be obtained.
     * @param Comment Template description.


Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Template type. Valid values:
<li>Preset: system preset template;</li>
<li>Custom: custom template.</li>

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Media quality inspection configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return QualityControlItemSet Media quality inspection configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public QualityControlItemConfig [] getQualityControlItemSet() {
        return this.QualityControlItemSet;
    }

    /**
     * Set Media quality inspection configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param QualityControlItemSet Media quality inspection configuration parameters.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQualityControlItemSet(QualityControlItemConfig [] QualityControlItemSet) {
        this.QualityControlItemSet = QualityControlItemSet;
    }

    /**
     * Get Creation time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Last modified time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Last modified time of a template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F).

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public QualityControlTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlTemplate(QualityControlTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.QualityControlItemSet != null) {
            this.QualityControlItemSet = new QualityControlItemConfig[source.QualityControlItemSet.length];
            for (int i = 0; i < source.QualityControlItemSet.length; i++) {
                this.QualityControlItemSet[i] = new QualityControlItemConfig(source.QualityControlItemSet[i]);
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "QualityControlItemSet.", this.QualityControlItemSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

