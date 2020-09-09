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

public class HttpStatusInfo extends AbstractModel{

    /**
    * Playback HTTP status code.
    */
    @SerializedName("HttpStatus")
    @Expose
    private String HttpStatus;

    /**
    * Quantity.
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get Playback HTTP status code. 
     * @return HttpStatus Playback HTTP status code.
     */
    public String getHttpStatus() {
        return this.HttpStatus;
    }

    /**
     * Set Playback HTTP status code.
     * @param HttpStatus Playback HTTP status code.
     */
    public void setHttpStatus(String HttpStatus) {
        this.HttpStatus = HttpStatus;
    }

    /**
     * Get Quantity. 
     * @return Num Quantity.
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Quantity.
     * @param Num Quantity.
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpStatus", this.HttpStatus);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}
