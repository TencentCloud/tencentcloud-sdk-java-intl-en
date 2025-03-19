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

public class CreateLiveRecordTemplateRequest extends AbstractModel {

    /**
    * HLS configuration parameters.
    */
    @SerializedName("HLSConfigure")
    @Expose
    private HLSConfigureInfo HLSConfigure;

    /**
    * Recording template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get HLS configuration parameters. 
     * @return HLSConfigure HLS configuration parameters.
     */
    public HLSConfigureInfo getHLSConfigure() {
        return this.HLSConfigure;
    }

    /**
     * Set HLS configuration parameters.
     * @param HLSConfigure HLS configuration parameters.
     */
    public void setHLSConfigure(HLSConfigureInfo HLSConfigure) {
        this.HLSConfigure = HLSConfigure;
    }

    /**
     * Get Recording template name. Length limit: 64 characters. 
     * @return Name Recording template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Recording template name. Length limit: 64 characters.
     * @param Name Recording template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateLiveRecordTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveRecordTemplateRequest(CreateLiveRecordTemplateRequest source) {
        if (source.HLSConfigure != null) {
            this.HLSConfigure = new HLSConfigureInfo(source.HLSConfigure);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HLSConfigure.", this.HLSConfigure);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

