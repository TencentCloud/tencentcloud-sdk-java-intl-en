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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitMediaOutputConfig extends AbstractModel {

    /**
    * 
    */
    @SerializedName("MediaName")
    @Expose
    private String MediaName;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get  
     * @return MediaName 
     */
    public String getMediaName() {
        return this.MediaName;
    }

    /**
     * Set 
     * @param MediaName 
     */
    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return ClassId 
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 
     * @param ClassId 
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get  
     * @return ExpireTime 
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 
     * @param ExpireTime 
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public SplitMediaOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitMediaOutputConfig(SplitMediaOutputConfig source) {
        if (source.MediaName != null) {
            this.MediaName = new String(source.MediaName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaName", this.MediaName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

