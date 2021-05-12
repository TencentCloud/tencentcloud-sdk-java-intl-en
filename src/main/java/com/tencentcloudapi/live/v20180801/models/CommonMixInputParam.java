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

public class CommonMixInputParam extends AbstractModel{

    /**
    * Input stream name of up to 80 bytes, which is a string containing letters, digits, and underscores.
    */
    @SerializedName("InputStreamName")
    @Expose
    private String InputStreamName;

    /**
    * Input stream layout parameter.
    */
    @SerializedName("LayoutParams")
    @Expose
    private CommonMixLayoutParams LayoutParams;

    /**
    * Input stream crop parameter.
    */
    @SerializedName("CropParams")
    @Expose
    private CommonMixCropParams CropParams;

    /**
     * Get Input stream name of up to 80 bytes, which is a string containing letters, digits, and underscores. 
     * @return InputStreamName Input stream name of up to 80 bytes, which is a string containing letters, digits, and underscores.
     */
    public String getInputStreamName() {
        return this.InputStreamName;
    }

    /**
     * Set Input stream name of up to 80 bytes, which is a string containing letters, digits, and underscores.
     * @param InputStreamName Input stream name of up to 80 bytes, which is a string containing letters, digits, and underscores.
     */
    public void setInputStreamName(String InputStreamName) {
        this.InputStreamName = InputStreamName;
    }

    /**
     * Get Input stream layout parameter. 
     * @return LayoutParams Input stream layout parameter.
     */
    public CommonMixLayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set Input stream layout parameter.
     * @param LayoutParams Input stream layout parameter.
     */
    public void setLayoutParams(CommonMixLayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get Input stream crop parameter. 
     * @return CropParams Input stream crop parameter.
     */
    public CommonMixCropParams getCropParams() {
        return this.CropParams;
    }

    /**
     * Set Input stream crop parameter.
     * @param CropParams Input stream crop parameter.
     */
    public void setCropParams(CommonMixCropParams CropParams) {
        this.CropParams = CropParams;
    }

    public CommonMixInputParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonMixInputParam(CommonMixInputParam source) {
        if (source.InputStreamName != null) {
            this.InputStreamName = new String(source.InputStreamName);
        }
        if (source.LayoutParams != null) {
            this.LayoutParams = new CommonMixLayoutParams(source.LayoutParams);
        }
        if (source.CropParams != null) {
            this.CropParams = new CommonMixCropParams(source.CropParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputStreamName", this.InputStreamName);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamObj(map, prefix + "CropParams.", this.CropParams);

    }
}

