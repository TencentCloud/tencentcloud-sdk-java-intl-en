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

public class CreateLiveRecordTemplateRequest extends AbstractModel {

    /**
    * HLS configuration parameter. Either this parameter or MP4Configure should be specified.
    */
    @SerializedName("HLSConfigure")
    @Expose
    private HLSConfigureInfo HLSConfigure;

    /**
    * MP4 configuration parameter. Either this parameter or HLSConfigure should be specified.
    */
    @SerializedName("MP4Configure")
    @Expose
    private MP4ConfigureInfo MP4Configure;

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
     * Get HLS configuration parameter. Either this parameter or MP4Configure should be specified. 
     * @return HLSConfigure HLS configuration parameter. Either this parameter or MP4Configure should be specified.
     */
    public HLSConfigureInfo getHLSConfigure() {
        return this.HLSConfigure;
    }

    /**
     * Set HLS configuration parameter. Either this parameter or MP4Configure should be specified.
     * @param HLSConfigure HLS configuration parameter. Either this parameter or MP4Configure should be specified.
     */
    public void setHLSConfigure(HLSConfigureInfo HLSConfigure) {
        this.HLSConfigure = HLSConfigure;
    }

    /**
     * Get MP4 configuration parameter. Either this parameter or HLSConfigure should be specified. 
     * @return MP4Configure MP4 configuration parameter. Either this parameter or HLSConfigure should be specified.
     */
    public MP4ConfigureInfo getMP4Configure() {
        return this.MP4Configure;
    }

    /**
     * Set MP4 configuration parameter. Either this parameter or HLSConfigure should be specified.
     * @param MP4Configure MP4 configuration parameter. Either this parameter or HLSConfigure should be specified.
     */
    public void setMP4Configure(MP4ConfigureInfo MP4Configure) {
        this.MP4Configure = MP4Configure;
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
        if (source.MP4Configure != null) {
            this.MP4Configure = new MP4ConfigureInfo(source.MP4Configure);
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
        this.setParamObj(map, prefix + "MP4Configure.", this.MP4Configure);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

