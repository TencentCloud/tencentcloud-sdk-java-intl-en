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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClipRangeInfo extends AbstractModel {

    /**
    * The vod type is valid, the content is valid starting time, Entire and SpecifyTimeRange are optional.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Offset, valid when Type is SpecifyTimeRange.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start offset, Valid when the Type is SpecifyTimeRange.
    */
    @SerializedName("StartOffset")
    @Expose
    private Long StartOffset;

    /**
    * End offset, valid when Type is SpecifyTimeRange.
    */
    @SerializedName("EndOffset")
    @Expose
    private Long EndOffset;

    /**
     * Get The vod type is valid, the content is valid starting time, Entire and SpecifyTimeRange are optional. 
     * @return Type The vod type is valid, the content is valid starting time, Entire and SpecifyTimeRange are optional.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The vod type is valid, the content is valid starting time, Entire and SpecifyTimeRange are optional.
     * @param Type The vod type is valid, the content is valid starting time, Entire and SpecifyTimeRange are optional.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Offset, valid when Type is SpecifyTimeRange. 
     * @return Offset Offset, valid when Type is SpecifyTimeRange.
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, valid when Type is SpecifyTimeRange.
     * @param Offset Offset, valid when Type is SpecifyTimeRange.
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start offset, Valid when the Type is SpecifyTimeRange. 
     * @return StartOffset Start offset, Valid when the Type is SpecifyTimeRange.
     */
    public Long getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set Start offset, Valid when the Type is SpecifyTimeRange.
     * @param StartOffset Start offset, Valid when the Type is SpecifyTimeRange.
     */
    public void setStartOffset(Long StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get End offset, valid when Type is SpecifyTimeRange. 
     * @return EndOffset End offset, valid when Type is SpecifyTimeRange.
     */
    public Long getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set End offset, valid when Type is SpecifyTimeRange.
     * @param EndOffset End offset, valid when Type is SpecifyTimeRange.
     */
    public void setEndOffset(Long EndOffset) {
        this.EndOffset = EndOffset;
    }

    public ClipRangeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClipRangeInfo(ClipRangeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.StartOffset != null) {
            this.StartOffset = new Long(source.StartOffset);
        }
        if (source.EndOffset != null) {
            this.EndOffset = new Long(source.EndOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);

    }
}

