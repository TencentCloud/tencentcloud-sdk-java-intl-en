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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityControlTemplateRequest extends AbstractModel {

    /**
    * Media quality inspection template name, with a length limit of 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Media quality inspection control parameters.
    */
    @SerializedName("QualityControlItemSet")
    @Expose
    private QualityControlItemConfig [] QualityControlItemSet;

    /**
    * Media quality inspection template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Recording file format. Valid values:
<li>PNG: PNG image.</li>
    */
    @SerializedName("RecordFormat")
    @Expose
    private String RecordFormat;

    /**
    * Spot check policy for media quality inspection.
    */
    @SerializedName("Strategy")
    @Expose
    private QualityControlStrategy Strategy;

    /**
     * Get Media quality inspection template name, with a length limit of 64 characters. 
     * @return Name Media quality inspection template name, with a length limit of 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Media quality inspection template name, with a length limit of 64 characters.
     * @param Name Media quality inspection template name, with a length limit of 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Media quality inspection control parameters. 
     * @return QualityControlItemSet Media quality inspection control parameters.
     */
    public QualityControlItemConfig [] getQualityControlItemSet() {
        return this.QualityControlItemSet;
    }

    /**
     * Set Media quality inspection control parameters.
     * @param QualityControlItemSet Media quality inspection control parameters.
     */
    public void setQualityControlItemSet(QualityControlItemConfig [] QualityControlItemSet) {
        this.QualityControlItemSet = QualityControlItemSet;
    }

    /**
     * Get Media quality inspection template description, with a length limit of 256 characters. 
     * @return Comment Media quality inspection template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Media quality inspection template description, with a length limit of 256 characters.
     * @param Comment Media quality inspection template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Recording file format. Valid values:
<li>PNG: PNG image.</li> 
     * @return RecordFormat Recording file format. Valid values:
<li>PNG: PNG image.</li>
     */
    public String getRecordFormat() {
        return this.RecordFormat;
    }

    /**
     * Set Recording file format. Valid values:
<li>PNG: PNG image.</li>
     * @param RecordFormat Recording file format. Valid values:
<li>PNG: PNG image.</li>
     */
    public void setRecordFormat(String RecordFormat) {
        this.RecordFormat = RecordFormat;
    }

    /**
     * Get Spot check policy for media quality inspection. 
     * @return Strategy Spot check policy for media quality inspection.
     */
    public QualityControlStrategy getStrategy() {
        return this.Strategy;
    }

    /**
     * Set Spot check policy for media quality inspection.
     * @param Strategy Spot check policy for media quality inspection.
     */
    public void setStrategy(QualityControlStrategy Strategy) {
        this.Strategy = Strategy;
    }

    public CreateQualityControlTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityControlTemplateRequest(CreateQualityControlTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.QualityControlItemSet != null) {
            this.QualityControlItemSet = new QualityControlItemConfig[source.QualityControlItemSet.length];
            for (int i = 0; i < source.QualityControlItemSet.length; i++) {
                this.QualityControlItemSet[i] = new QualityControlItemConfig(source.QualityControlItemSet[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.RecordFormat != null) {
            this.RecordFormat = new String(source.RecordFormat);
        }
        if (source.Strategy != null) {
            this.Strategy = new QualityControlStrategy(source.Strategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "QualityControlItemSet.", this.QualityControlItemSet);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "RecordFormat", this.RecordFormat);
        this.setParamObj(map, prefix + "Strategy.", this.Strategy);

    }
}

