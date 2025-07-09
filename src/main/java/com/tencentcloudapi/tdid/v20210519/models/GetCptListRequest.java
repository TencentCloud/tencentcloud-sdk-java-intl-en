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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCptListRequest extends AbstractModel {

    /**
    * The start.
    */
    @SerializedName("DisplayStart")
    @Expose
    private Long DisplayStart;

    /**
    * The maximum number of records to return.
    */
    @SerializedName("DisplayLength")
    @Expose
    private Long DisplayLength;

    /**
    * The type. `0`: All CPTs; `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
    */
    @SerializedName("CptType")
    @Expose
    private Long CptType;

    /**
     * Get The start. 
     * @return DisplayStart The start.
     */
    public Long getDisplayStart() {
        return this.DisplayStart;
    }

    /**
     * Set The start.
     * @param DisplayStart The start.
     */
    public void setDisplayStart(Long DisplayStart) {
        this.DisplayStart = DisplayStart;
    }

    /**
     * Get The maximum number of records to return. 
     * @return DisplayLength The maximum number of records to return.
     */
    public Long getDisplayLength() {
        return this.DisplayLength;
    }

    /**
     * Set The maximum number of records to return.
     * @param DisplayLength The maximum number of records to return.
     */
    public void setDisplayLength(Long DisplayLength) {
        this.DisplayLength = DisplayLength;
    }

    /**
     * Get The type. `0`: All CPTs; `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs 
     * @return CptType The type. `0`: All CPTs; `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     */
    public Long getCptType() {
        return this.CptType;
    }

    /**
     * Set The type. `0`: All CPTs; `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     * @param CptType The type. `0`: All CPTs; `1`: System CPTs; `2`: Authorization CPTs; `3`: General CPTs
     */
    public void setCptType(Long CptType) {
        this.CptType = CptType;
    }

    public GetCptListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCptListRequest(GetCptListRequest source) {
        if (source.DisplayStart != null) {
            this.DisplayStart = new Long(source.DisplayStart);
        }
        if (source.DisplayLength != null) {
            this.DisplayLength = new Long(source.DisplayLength);
        }
        if (source.CptType != null) {
            this.CptType = new Long(source.CptType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStart", this.DisplayStart);
        this.setParamSimple(map, prefix + "DisplayLength", this.DisplayLength);
        this.setParamSimple(map, prefix + "CptType", this.CptType);

    }
}

