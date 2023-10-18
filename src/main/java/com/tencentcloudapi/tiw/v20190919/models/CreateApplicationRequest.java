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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApplicationRequest extends AbstractModel {

    /**
    * SdkAppId of the whiteboard application.
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Application name.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * SKey required for creating an IM application.
    */
    @SerializedName("SKey")
    @Expose
    private String SKey;

    /**
    * TinyId required for creating an IM application.
    */
    @SerializedName("TinyId")
    @Expose
    private String TinyId;

    /**
    * List of tags to be bound.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get SdkAppId of the whiteboard application. 
     * @return SdkAppId SdkAppId of the whiteboard application.
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set SdkAppId of the whiteboard application.
     * @param SdkAppId SdkAppId of the whiteboard application.
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Application name. 
     * @return AppName Application name.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name.
     * @param AppName Application name.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get SKey required for creating an IM application. 
     * @return SKey SKey required for creating an IM application.
     */
    public String getSKey() {
        return this.SKey;
    }

    /**
     * Set SKey required for creating an IM application.
     * @param SKey SKey required for creating an IM application.
     */
    public void setSKey(String SKey) {
        this.SKey = SKey;
    }

    /**
     * Get TinyId required for creating an IM application. 
     * @return TinyId TinyId required for creating an IM application.
     */
    public String getTinyId() {
        return this.TinyId;
    }

    /**
     * Set TinyId required for creating an IM application.
     * @param TinyId TinyId required for creating an IM application.
     */
    public void setTinyId(String TinyId) {
        this.TinyId = TinyId;
    }

    /**
     * Get List of tags to be bound. 
     * @return TagList List of tags to be bound.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set List of tags to be bound.
     * @param TagList List of tags to be bound.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationRequest(CreateApplicationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.SKey != null) {
            this.SKey = new String(source.SKey);
        }
        if (source.TinyId != null) {
            this.TinyId = new String(source.TinyId);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "SKey", this.SKey);
        this.setParamSimple(map, prefix + "TinyId", this.TinyId);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

