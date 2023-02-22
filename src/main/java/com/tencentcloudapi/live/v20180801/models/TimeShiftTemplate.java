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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftTemplate extends AbstractModel{

    /**
    * The template name.
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * The time shifting duration.
Unit: second
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * The segment size.
Value range: 3-10.
Unit: Second.
Default value: 5
    */
    @SerializedName("ItemDuration")
    @Expose
    private Long ItemDuration;

    /**
    * The template ID.
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * The template description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The region. Valid values:
`Mainland`: The Chinese mainland.
`Overseas`: Outside the Chinese mainland.
Default value: `Mainland`.
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Whether to remove watermarks.
If you pass in `true`, the original stream will be recorded.
Default value: `false`.
    */
    @SerializedName("RemoveWatermark")
    @Expose
    private Boolean RemoveWatermark;

    /**
    * The transcoding template IDs.
This API works only if `RemoveWatermark` is `false`.
    */
    @SerializedName("TranscodeTemplateIds")
    @Expose
    private Long [] TranscodeTemplateIds;

    /**
     * Get The template name. 
     * @return TemplateName The template name.
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set The template name.
     * @param TemplateName The template name.
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get The time shifting duration.
Unit: second 
     * @return Duration The time shifting duration.
Unit: second
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set The time shifting duration.
Unit: second
     * @param Duration The time shifting duration.
Unit: second
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The segment size.
Value range: 3-10.
Unit: Second.
Default value: 5 
     * @return ItemDuration The segment size.
Value range: 3-10.
Unit: Second.
Default value: 5
     */
    public Long getItemDuration() {
        return this.ItemDuration;
    }

    /**
     * Set The segment size.
Value range: 3-10.
Unit: Second.
Default value: 5
     * @param ItemDuration The segment size.
Value range: 3-10.
Unit: Second.
Default value: 5
     */
    public void setItemDuration(Long ItemDuration) {
        this.ItemDuration = ItemDuration;
    }

    /**
     * Get The template ID. 
     * @return TemplateId The template ID.
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set The template ID.
     * @param TemplateId The template ID.
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get The template description. 
     * @return Description The template description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set The template description.
     * @param Description The template description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get The region. Valid values:
`Mainland`: The Chinese mainland.
`Overseas`: Outside the Chinese mainland.
Default value: `Mainland`. 
     * @return Area The region. Valid values:
`Mainland`: The Chinese mainland.
`Overseas`: Outside the Chinese mainland.
Default value: `Mainland`.
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set The region. Valid values:
`Mainland`: The Chinese mainland.
`Overseas`: Outside the Chinese mainland.
Default value: `Mainland`.
     * @param Area The region. Valid values:
`Mainland`: The Chinese mainland.
`Overseas`: Outside the Chinese mainland.
Default value: `Mainland`.
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Whether to remove watermarks.
If you pass in `true`, the original stream will be recorded.
Default value: `false`. 
     * @return RemoveWatermark Whether to remove watermarks.
If you pass in `true`, the original stream will be recorded.
Default value: `false`.
     */
    public Boolean getRemoveWatermark() {
        return this.RemoveWatermark;
    }

    /**
     * Set Whether to remove watermarks.
If you pass in `true`, the original stream will be recorded.
Default value: `false`.
     * @param RemoveWatermark Whether to remove watermarks.
If you pass in `true`, the original stream will be recorded.
Default value: `false`.
     */
    public void setRemoveWatermark(Boolean RemoveWatermark) {
        this.RemoveWatermark = RemoveWatermark;
    }

    /**
     * Get The transcoding template IDs.
This API works only if `RemoveWatermark` is `false`. 
     * @return TranscodeTemplateIds The transcoding template IDs.
This API works only if `RemoveWatermark` is `false`.
     */
    public Long [] getTranscodeTemplateIds() {
        return this.TranscodeTemplateIds;
    }

    /**
     * Set The transcoding template IDs.
This API works only if `RemoveWatermark` is `false`.
     * @param TranscodeTemplateIds The transcoding template IDs.
This API works only if `RemoveWatermark` is `false`.
     */
    public void setTranscodeTemplateIds(Long [] TranscodeTemplateIds) {
        this.TranscodeTemplateIds = TranscodeTemplateIds;
    }

    public TimeShiftTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftTemplate(TimeShiftTemplate source) {
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ItemDuration != null) {
            this.ItemDuration = new Long(source.ItemDuration);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.RemoveWatermark != null) {
            this.RemoveWatermark = new Boolean(source.RemoveWatermark);
        }
        if (source.TranscodeTemplateIds != null) {
            this.TranscodeTemplateIds = new Long[source.TranscodeTemplateIds.length];
            for (int i = 0; i < source.TranscodeTemplateIds.length; i++) {
                this.TranscodeTemplateIds[i] = new Long(source.TranscodeTemplateIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ItemDuration", this.ItemDuration);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "RemoveWatermark", this.RemoveWatermark);
        this.setParamArraySimple(map, prefix + "TranscodeTemplateIds.", this.TranscodeTemplateIds);

    }
}

