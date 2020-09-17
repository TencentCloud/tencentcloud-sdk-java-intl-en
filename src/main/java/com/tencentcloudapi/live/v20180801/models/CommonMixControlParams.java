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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixControlParams extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UseMixCropCenter", this.UseMixCropCenter);
        this.setParamSimple(map, prefix + "AllowCopy", this.AllowCopy);

    }
}

