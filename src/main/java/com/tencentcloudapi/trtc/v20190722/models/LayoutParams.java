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
    * On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template.
    */
    @SerializedName("Template")
    @Expose
    private Long Template;

    /**
    * ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
    */
    @SerializedName("MainVideoUserId")
    @Expose
    private String MainVideoUserId;

    /**
    * Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
    */
    @SerializedName("MainVideoStreamType")
    @Expose
    private Long MainVideoStreamType;

    /**
    * Layout parameter of the small image, which takes effect in a picture-in-picture template.
    */
    @SerializedName("SmallVideoLayoutParams")
    @Expose
    private SmallVideoLayoutParams SmallVideoLayoutParams;

    /**
     * Get On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template. 
     * @return Template On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template.
     */
    public Long getTemplate() {
        return this.Template;
    }

    /**
     * Set On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template.
     * @param Template On-cloud stream mix layout template ID. 0: floating template (default value); 1: grid template; 2: screen sharing template; 3: picture-in-picture template.
     */
    public void setTemplate(Long Template) {
        this.Template = Template;
    }

    /**
     * Get ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 
     * @return MainVideoUserId ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     */
    public String getMainVideoUserId() {
        return this.MainVideoUserId;
    }

    /**
     * Set ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     * @param MainVideoUserId ID of the user in the big image, which takes effect in a screen sharing, floating, or picture-in-picture template.
     */
    public void setMainVideoUserId(String MainVideoUserId) {
        this.MainVideoUserId = MainVideoUserId;
    }

    /**
     * Get Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter. 
     * @return MainVideoStreamType Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     */
    public Long getMainVideoStreamType() {
        return this.MainVideoStreamType;
    }

    /**
     * Set Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     * @param MainVideoStreamType Stream type of the big image, which takes effect in a screen sharing, floating, or picture-in-picture template. 0: camera; 1: screen sharing. If a web user's stream is displayed in the big image on the left, enter 0 for this parameter.
     */
    public void setMainVideoStreamType(Long MainVideoStreamType) {
        this.MainVideoStreamType = MainVideoStreamType;
    }

    /**
     * Get Layout parameter of the small image, which takes effect in a picture-in-picture template. 
     * @return SmallVideoLayoutParams Layout parameter of the small image, which takes effect in a picture-in-picture template.
     */
    public SmallVideoLayoutParams getSmallVideoLayoutParams() {
        return this.SmallVideoLayoutParams;
    }

    /**
     * Set Layout parameter of the small image, which takes effect in a picture-in-picture template.
     * @param SmallVideoLayoutParams Layout parameter of the small image, which takes effect in a picture-in-picture template.
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

