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

public class CommonMixControlParams extends AbstractModel {

    /**
    * Value range: [0,1]. 
If 1 is entered, when the layer resolution in the parameter is different from the actual video resolution, the video will be automatically cropped according to the resolution set by the layer.
    */
    @SerializedName("UseMixCropCenter")
    @Expose
    private Long UseMixCropCenter;

    /**
    * Value range: [0,1].
If this parameter is set to 1, when both `InputStreamList` and `OutputParams.OutputStreamType` are set to 1, you can copy a stream instead of canceling it.
    */
    @SerializedName("AllowCopy")
    @Expose
    private Long AllowCopy;

    /**
    * Valid values: 0, 1
If you set this parameter to 1, SEI (Supplemental Enhanced Information) of the input streams will be passed through.
    */
    @SerializedName("PassInputSei")
    @Expose
    private Long PassInputSei;

    /**
     * Get Value range: [0,1]. 
If 1 is entered, when the layer resolution in the parameter is different from the actual video resolution, the video will be automatically cropped according to the resolution set by the layer. 
     * @return UseMixCropCenter Value range: [0,1]. 
If 1 is entered, when the layer resolution in the parameter is different from the actual video resolution, the video will be automatically cropped according to the resolution set by the layer.
     */
    public Long getUseMixCropCenter() {
        return this.UseMixCropCenter;
    }

    /**
     * Set Value range: [0,1]. 
If 1 is entered, when the layer resolution in the parameter is different from the actual video resolution, the video will be automatically cropped according to the resolution set by the layer.
     * @param UseMixCropCenter Value range: [0,1]. 
If 1 is entered, when the layer resolution in the parameter is different from the actual video resolution, the video will be automatically cropped according to the resolution set by the layer.
     */
    public void setUseMixCropCenter(Long UseMixCropCenter) {
        this.UseMixCropCenter = UseMixCropCenter;
    }

    /**
     * Get Value range: [0,1].
If this parameter is set to 1, when both `InputStreamList` and `OutputParams.OutputStreamType` are set to 1, you can copy a stream instead of canceling it. 
     * @return AllowCopy Value range: [0,1].
If this parameter is set to 1, when both `InputStreamList` and `OutputParams.OutputStreamType` are set to 1, you can copy a stream instead of canceling it.
     */
    public Long getAllowCopy() {
        return this.AllowCopy;
    }

    /**
     * Set Value range: [0,1].
If this parameter is set to 1, when both `InputStreamList` and `OutputParams.OutputStreamType` are set to 1, you can copy a stream instead of canceling it.
     * @param AllowCopy Value range: [0,1].
If this parameter is set to 1, when both `InputStreamList` and `OutputParams.OutputStreamType` are set to 1, you can copy a stream instead of canceling it.
     */
    public void setAllowCopy(Long AllowCopy) {
        this.AllowCopy = AllowCopy;
    }

    /**
     * Get Valid values: 0, 1
If you set this parameter to 1, SEI (Supplemental Enhanced Information) of the input streams will be passed through. 
     * @return PassInputSei Valid values: 0, 1
If you set this parameter to 1, SEI (Supplemental Enhanced Information) of the input streams will be passed through.
     */
    public Long getPassInputSei() {
        return this.PassInputSei;
    }

    /**
     * Set Valid values: 0, 1
If you set this parameter to 1, SEI (Supplemental Enhanced Information) of the input streams will be passed through.
     * @param PassInputSei Valid values: 0, 1
If you set this parameter to 1, SEI (Supplemental Enhanced Information) of the input streams will be passed through.
     */
    public void setPassInputSei(Long PassInputSei) {
        this.PassInputSei = PassInputSei;
    }

    public CommonMixControlParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixControlParams(CommonMixControlParams source) {
        if (source.UseMixCropCenter != null) {
            this.UseMixCropCenter = new Long(source.UseMixCropCenter);
        }
        if (source.AllowCopy != null) {
            this.AllowCopy = new Long(source.AllowCopy);
        }
        if (source.PassInputSei != null) {
            this.PassInputSei = new Long(source.PassInputSei);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseMixCropCenter", this.UseMixCropCenter);
        this.setParamSimple(map, prefix + "AllowCopy", this.AllowCopy);
        this.setParamSimple(map, prefix + "PassInputSei", this.PassInputSei);

    }
}

