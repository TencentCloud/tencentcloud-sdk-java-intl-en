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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineItem extends AbstractModel {

    /**
    * Parses the line name.
    */
    @SerializedName("LineName")
    @Expose
    private String LineName;

    /**
    * Resolution route ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

    /**
    * Indicates whether the current line is available under the current domain.
    */
    @SerializedName("Useful")
    @Expose
    private Boolean Useful;

    /**
    * Current line min plan level requirement.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Grade")
    @Expose
    private String Grade;

    /**
    * Describes the sub-line list under the current line category.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubGroup")
    @Expose
    private LineItem [] SubGroup;

    /**
    * Specifies the lines included in the custom line grouping.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
     * Get Parses the line name. 
     * @return LineName Parses the line name.
     */
    public String getLineName() {
        return this.LineName;
    }

    /**
     * Set Parses the line name.
     * @param LineName Parses the line name.
     */
    public void setLineName(String LineName) {
        this.LineName = LineName;
    }

    /**
     * Get Resolution route ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LineId Resolution route ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set Resolution route ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LineId Resolution route ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    /**
     * Get Indicates whether the current line is available under the current domain. 
     * @return Useful Indicates whether the current line is available under the current domain.
     */
    public Boolean getUseful() {
        return this.Useful;
    }

    /**
     * Set Indicates whether the current line is available under the current domain.
     * @param Useful Indicates whether the current line is available under the current domain.
     */
    public void setUseful(Boolean Useful) {
        this.Useful = Useful;
    }

    /**
     * Get Current line min plan level requirement.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Grade Current line min plan level requirement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGrade() {
        return this.Grade;
    }

    /**
     * Set Current line min plan level requirement.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Grade Current line min plan level requirement.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * Get Describes the sub-line list under the current line category.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubGroup Describes the sub-line list under the current line category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LineItem [] getSubGroup() {
        return this.SubGroup;
    }

    /**
     * Set Describes the sub-line list under the current line category.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubGroup Describes the sub-line list under the current line category.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubGroup(LineItem [] SubGroup) {
        this.SubGroup = SubGroup;
    }

    /**
     * Get Specifies the lines included in the custom line grouping.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Lines Specifies the lines included in the custom line grouping.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set Specifies the lines included in the custom line grouping.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Lines Specifies the lines included in the custom line grouping.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    public LineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineItem(LineItem source) {
        if (source.LineName != null) {
            this.LineName = new String(source.LineName);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
        if (source.Useful != null) {
            this.Useful = new Boolean(source.Useful);
        }
        if (source.Grade != null) {
            this.Grade = new String(source.Grade);
        }
        if (source.SubGroup != null) {
            this.SubGroup = new LineItem[source.SubGroup.length];
            for (int i = 0; i < source.SubGroup.length; i++) {
                this.SubGroup[i] = new LineItem(source.SubGroup[i]);
            }
        }
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LineName", this.LineName);
        this.setParamSimple(map, prefix + "LineId", this.LineId);
        this.setParamSimple(map, prefix + "Useful", this.Useful);
        this.setParamSimple(map, prefix + "Grade", this.Grade);
        this.setParamArrayObj(map, prefix + "SubGroup.", this.SubGroup);
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);

    }
}

