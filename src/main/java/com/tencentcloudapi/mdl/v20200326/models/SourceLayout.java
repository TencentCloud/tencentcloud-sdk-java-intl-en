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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceLayout extends AbstractModel {

    /**
    * 
    */
    @SerializedName("LeftOffset")
    @Expose
    private Long LeftOffset;

    /**
    * 
    */
    @SerializedName("RightOffset")
    @Expose
    private Long RightOffset;

    /**
    * 
    */
    @SerializedName("BottomOffset")
    @Expose
    private Long BottomOffset;

    /**
     * Get  
     * @return LeftOffset 
     */
    public Long getLeftOffset() {
        return this.LeftOffset;
    }

    /**
     * Set 
     * @param LeftOffset 
     */
    public void setLeftOffset(Long LeftOffset) {
        this.LeftOffset = LeftOffset;
    }

    /**
     * Get  
     * @return RightOffset 
     */
    public Long getRightOffset() {
        return this.RightOffset;
    }

    /**
     * Set 
     * @param RightOffset 
     */
    public void setRightOffset(Long RightOffset) {
        this.RightOffset = RightOffset;
    }

    /**
     * Get  
     * @return BottomOffset 
     */
    public Long getBottomOffset() {
        return this.BottomOffset;
    }

    /**
     * Set 
     * @param BottomOffset 
     */
    public void setBottomOffset(Long BottomOffset) {
        this.BottomOffset = BottomOffset;
    }

    public SourceLayout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceLayout(SourceLayout source) {
        if (source.LeftOffset != null) {
            this.LeftOffset = new Long(source.LeftOffset);
        }
        if (source.RightOffset != null) {
            this.RightOffset = new Long(source.RightOffset);
        }
        if (source.BottomOffset != null) {
            this.BottomOffset = new Long(source.BottomOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LeftOffset", this.LeftOffset);
        this.setParamSimple(map, prefix + "RightOffset", this.RightOffset);
        this.setParamSimple(map, prefix + "BottomOffset", this.BottomOffset);

    }
}

