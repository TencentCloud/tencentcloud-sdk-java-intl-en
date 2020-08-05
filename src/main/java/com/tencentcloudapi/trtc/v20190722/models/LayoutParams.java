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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LayoutParams extends AbstractModel{

    /**
    * On-Cloud MixTranscoding layout template ID. 0: floating template (default value); 1: 9-grid template; 2: screen sharing template
    */
    @SerializedName("Template")
    @Expose
    private Long Template;

    /**
    * ID of the user in the big image on the left, which takes effect in the screen sharing template
    */
    @SerializedName("MainVideoUserId")
    @Expose
    private String MainVideoUserId;

    /**
    * Stream type of the big image on the left, which takes effect in the screen sharing template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter
    */
    @SerializedName("MainVideoStreamType")
    @Expose
    private Long MainVideoStreamType;

    /**
    * 
    */
    @SerializedName("SmallVideoLayoutParams")
    @Expose
    private SmallVideoLayoutParams SmallVideoLayoutParams;

    /**
     * Get On-Cloud MixTranscoding layout template ID. 0: floating template (default value); 1: 9-grid template; 2: screen sharing template 
     * @return Template On-Cloud MixTranscoding layout template ID. 0: floating template (default value); 1: 9-grid template; 2: screen sharing template
     */
    public Long getTemplate() {
        return this.Template;
    }

    /**
     * Set On-Cloud MixTranscoding layout template ID. 0: floating template (default value); 1: 9-grid template; 2: screen sharing template
     * @param Template On-Cloud MixTranscoding layout template ID. 0: floating template (default value); 1: 9-grid template; 2: screen sharing template
     */
    public void setTemplate(Long Template) {
        this.Template = Template;
    }

    /**
     * Get ID of the user in the big image on the left, which takes effect in the screen sharing template 
     * @return MainVideoUserId ID of the user in the big image on the left, which takes effect in the screen sharing template
     */
    public String getMainVideoUserId() {
        return this.MainVideoUserId;
    }

    /**
     * Set ID of the user in the big image on the left, which takes effect in the screen sharing template
     * @param MainVideoUserId ID of the user in the big image on the left, which takes effect in the screen sharing template
     */
    public void setMainVideoUserId(String MainVideoUserId) {
        this.MainVideoUserId = MainVideoUserId;
    }

    /**
     * Get Stream type of the big image on the left, which takes effect in the screen sharing template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter 
     * @return MainVideoStreamType Stream type of the big image on the left, which takes effect in the screen sharing template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter
     */
    public Long getMainVideoStreamType() {
        return this.MainVideoStreamType;
    }

    /**
     * Set Stream type of the big image on the left, which takes effect in the screen sharing template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter
     * @param MainVideoStreamType Stream type of the big image on the left, which takes effect in the screen sharing template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter
     */
    public void setMainVideoStreamType(Long MainVideoStreamType) {
        this.MainVideoStreamType = MainVideoStreamType;
    }

    /**
     * Get  
     * @return SmallVideoLayoutParams 
     */
    public SmallVideoLayoutParams getSmallVideoLayoutParams() {
        return this.SmallVideoLayoutParams;
    }

    /**
     * Set 
     * @param SmallVideoLayoutParams 
     */
    public void setSmallVideoLayoutParams(SmallVideoLayoutParams SmallVideoLayoutParams) {
        this.SmallVideoLayoutParams = SmallVideoLayoutParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Template", this.Template);
        this.setParamSimple(map, prefix + "MainVideoUserId", this.MainVideoUserId);
        this.setParamSimple(map, prefix + "MainVideoStreamType", this.MainVideoStreamType);
        this.setParamObj(map, prefix + "SmallVideoLayoutParams.", this.SmallVideoLayoutParams);

    }
}

