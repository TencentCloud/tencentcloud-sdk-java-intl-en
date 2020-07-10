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

public class ProIspPlayCodeDataInfo extends AbstractModel{

    /**
    * 
    */
    @SerializedName("CountryAreaName")
    @Expose
    private String CountryAreaName;

    /**
    * District.
    */
    @SerializedName("ProvinceName")
    @Expose
    private String ProvinceName;

    /**
    * ISP.
    */
    @SerializedName("IspName")
    @Expose
    private String IspName;

    /**
    * 
    */
    @SerializedName("Code2xx")
    @Expose
    private Long Code2xx;

    /**
    * 
    */
    @SerializedName("Code3xx")
    @Expose
    private Long Code3xx;

    /**
    * Occurrences of 4xx error codes.
    */
    @SerializedName("Code4xx")
    @Expose
    private Long Code4xx;

    /**
    * Occurrences of 5xx error codes.
    */
    @SerializedName("Code5xx")
    @Expose
    private Long Code5xx;

    /**
     * Get  
     * @return CountryAreaName 
     */
    public String getCountryAreaName() {
        return this.CountryAreaName;
    }

    /**
     * Set 
     * @param CountryAreaName 
     */
    public void setCountryAreaName(String CountryAreaName) {
        this.CountryAreaName = CountryAreaName;
    }

    /**
     * Get District. 
     * @return ProvinceName District.
     */
    public String getProvinceName() {
        return this.ProvinceName;
    }

    /**
     * Set District.
     * @param ProvinceName District.
     */
    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    /**
     * Get ISP. 
     * @return IspName ISP.
     */
    public String getIspName() {
        return this.IspName;
    }

    /**
     * Set ISP.
     * @param IspName ISP.
     */
    public void setIspName(String IspName) {
        this.IspName = IspName;
    }

    /**
     * Get  
     * @return Code2xx 
     */
    public Long getCode2xx() {
        return this.Code2xx;
    }

    /**
     * Set 
     * @param Code2xx 
     */
    public void setCode2xx(Long Code2xx) {
        this.Code2xx = Code2xx;
    }

    /**
     * Get  
     * @return Code3xx 
     */
    public Long getCode3xx() {
        return this.Code3xx;
    }

    /**
     * Set 
     * @param Code3xx 
     */
    public void setCode3xx(Long Code3xx) {
        this.Code3xx = Code3xx;
    }

    /**
     * Get Occurrences of 4xx error codes. 
     * @return Code4xx Occurrences of 4xx error codes.
     */
    public Long getCode4xx() {
        return this.Code4xx;
    }

    /**
     * Set Occurrences of 4xx error codes.
     * @param Code4xx Occurrences of 4xx error codes.
     */
    public void setCode4xx(Long Code4xx) {
        this.Code4xx = Code4xx;
    }

    /**
     * Get Occurrences of 5xx error codes. 
     * @return Code5xx Occurrences of 5xx error codes.
     */
    public Long getCode5xx() {
        return this.Code5xx;
    }

    /**
     * Set Occurrences of 5xx error codes.
     * @param Code5xx Occurrences of 5xx error codes.
     */
    public void setCode5xx(Long Code5xx) {
        this.Code5xx = Code5xx;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CountryAreaName", this.CountryAreaName);
        this.setParamSimple(map, prefix + "ProvinceName", this.ProvinceName);
        this.setParamSimple(map, prefix + "IspName", this.IspName);
        this.setParamSimple(map, prefix + "Code2xx", this.Code2xx);
        this.setParamSimple(map, prefix + "Code3xx", this.Code3xx);
        this.setParamSimple(map, prefix + "Code4xx", this.Code4xx);
        this.setParamSimple(map, prefix + "Code5xx", this.Code5xx);

    }
}

