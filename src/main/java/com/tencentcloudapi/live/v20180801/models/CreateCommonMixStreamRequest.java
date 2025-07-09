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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommonMixStreamRequest extends AbstractModel {

    /**
    * ID of a stream mix session (from applying for the stream mix to cancelling it). This parameter can contain up to 80 bytes of letters, digits, and underscores.
    */
    @SerializedName("MixStreamSessionId")
    @Expose
    private String MixStreamSessionId;

    /**
    * Input stream list for stream mix.
    */
    @SerializedName("InputStreamList")
    @Expose
    private CommonMixInputParam [] InputStreamList;

    /**
    * Output stream parameter for stream mix.
    */
    @SerializedName("OutputParams")
    @Expose
    private CommonMixOutputParams OutputParams;

    /**
    * Input template ID. If this parameter is set, the output will be generated according to the default template layout, and there is no need to enter the custom position parameters.
If this parameter is left empty, 0 will be used by default.
For two input sources, 10, 20, 30, 40, and 50 are supported.
For three input sources, 310, 390, and 391 are supported.
For four input sources, 410 is supported.
For five input sources, 510 and 590 are supported.
For six input sources, 610 is supported.
    */
    @SerializedName("MixStreamTemplateId")
    @Expose
    private Long MixStreamTemplateId;

    /**
    * Special control parameter for stream mix. If there are no special needs, leave it empty.
    */
    @SerializedName("ControlParams")
    @Expose
    private CommonMixControlParams ControlParams;

    /**
     * Get ID of a stream mix session (from applying for the stream mix to cancelling it). This parameter can contain up to 80 bytes of letters, digits, and underscores. 
     * @return MixStreamSessionId ID of a stream mix session (from applying for the stream mix to cancelling it). This parameter can contain up to 80 bytes of letters, digits, and underscores.
     */
    public String getMixStreamSessionId() {
        return this.MixStreamSessionId;
    }

    /**
     * Set ID of a stream mix session (from applying for the stream mix to cancelling it). This parameter can contain up to 80 bytes of letters, digits, and underscores.
     * @param MixStreamSessionId ID of a stream mix session (from applying for the stream mix to cancelling it). This parameter can contain up to 80 bytes of letters, digits, and underscores.
     */
    public void setMixStreamSessionId(String MixStreamSessionId) {
        this.MixStreamSessionId = MixStreamSessionId;
    }

    /**
     * Get Input stream list for stream mix. 
     * @return InputStreamList Input stream list for stream mix.
     */
    public CommonMixInputParam [] getInputStreamList() {
        return this.InputStreamList;
    }

    /**
     * Set Input stream list for stream mix.
     * @param InputStreamList Input stream list for stream mix.
     */
    public void setInputStreamList(CommonMixInputParam [] InputStreamList) {
        this.InputStreamList = InputStreamList;
    }

    /**
     * Get Output stream parameter for stream mix. 
     * @return OutputParams Output stream parameter for stream mix.
     */
    public CommonMixOutputParams getOutputParams() {
        return this.OutputParams;
    }

    /**
     * Set Output stream parameter for stream mix.
     * @param OutputParams Output stream parameter for stream mix.
     */
    public void setOutputParams(CommonMixOutputParams OutputParams) {
        this.OutputParams = OutputParams;
    }

    /**
     * Get Input template ID. If this parameter is set, the output will be generated according to the default template layout, and there is no need to enter the custom position parameters.
If this parameter is left empty, 0 will be used by default.
For two input sources, 10, 20, 30, 40, and 50 are supported.
For three input sources, 310, 390, and 391 are supported.
For four input sources, 410 is supported.
For five input sources, 510 and 590 are supported.
For six input sources, 610 is supported. 
     * @return MixStreamTemplateId Input template ID. If this parameter is set, the output will be generated according to the default template layout, and there is no need to enter the custom position parameters.
If this parameter is left empty, 0 will be used by default.
For two input sources, 10, 20, 30, 40, and 50 are supported.
For three input sources, 310, 390, and 391 are supported.
For four input sources, 410 is supported.
For five input sources, 510 and 590 are supported.
For six input sources, 610 is supported.
     */
    public Long getMixStreamTemplateId() {
        return this.MixStreamTemplateId;
    }

    /**
     * Set Input template ID. If this parameter is set, the output will be generated according to the default template layout, and there is no need to enter the custom position parameters.
If this parameter is left empty, 0 will be used by default.
For two input sources, 10, 20, 30, 40, and 50 are supported.
For three input sources, 310, 390, and 391 are supported.
For four input sources, 410 is supported.
For five input sources, 510 and 590 are supported.
For six input sources, 610 is supported.
     * @param MixStreamTemplateId Input template ID. If this parameter is set, the output will be generated according to the default template layout, and there is no need to enter the custom position parameters.
If this parameter is left empty, 0 will be used by default.
For two input sources, 10, 20, 30, 40, and 50 are supported.
For three input sources, 310, 390, and 391 are supported.
For four input sources, 410 is supported.
For five input sources, 510 and 590 are supported.
For six input sources, 610 is supported.
     */
    public void setMixStreamTemplateId(Long MixStreamTemplateId) {
        this.MixStreamTemplateId = MixStreamTemplateId;
    }

    /**
     * Get Special control parameter for stream mix. If there are no special needs, leave it empty. 
     * @return ControlParams Special control parameter for stream mix. If there are no special needs, leave it empty.
     */
    public CommonMixControlParams getControlParams() {
        return this.ControlParams;
    }

    /**
     * Set Special control parameter for stream mix. If there are no special needs, leave it empty.
     * @param ControlParams Special control parameter for stream mix. If there are no special needs, leave it empty.
     */
    public void setControlParams(CommonMixControlParams ControlParams) {
        this.ControlParams = ControlParams;
    }

    public CreateCommonMixStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCommonMixStreamRequest(CreateCommonMixStreamRequest source) {
        if (source.MixStreamSessionId != null) {
            this.MixStreamSessionId = new String(source.MixStreamSessionId);
        }
        if (source.InputStreamList != null) {
            this.InputStreamList = new CommonMixInputParam[source.InputStreamList.length];
            for (int i = 0; i < source.InputStreamList.length; i++) {
                this.InputStreamList[i] = new CommonMixInputParam(source.InputStreamList[i]);
            }
        }
        if (source.OutputParams != null) {
            this.OutputParams = new CommonMixOutputParams(source.OutputParams);
        }
        if (source.MixStreamTemplateId != null) {
            this.MixStreamTemplateId = new Long(source.MixStreamTemplateId);
        }
        if (source.ControlParams != null) {
            this.ControlParams = new CommonMixControlParams(source.ControlParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixStreamSessionId", this.MixStreamSessionId);
        this.setParamArrayObj(map, prefix + "InputStreamList.", this.InputStreamList);
        this.setParamObj(map, prefix + "OutputParams.", this.OutputParams);
        this.setParamSimple(map, prefix + "MixStreamTemplateId", this.MixStreamTemplateId);
        this.setParamObj(map, prefix + "ControlParams.", this.ControlParams);

    }
}

