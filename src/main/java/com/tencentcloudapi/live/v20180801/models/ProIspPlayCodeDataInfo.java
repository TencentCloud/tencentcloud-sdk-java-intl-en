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

public class ProIspPlayCodeDataInfo extends AbstractModel {

    /**
    * Country or region.
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
    * Occurrences of 2xx error codes.
    */
    @SerializedName("Code2xx")
    @Expose
    private Long Code2xx;

    /**
    * Occurrences of 3xx error codes.
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
     * Get Country or region. 
     * @return CountryAreaName Country or region.
     */
    public String getCountryAreaName() {
        return this.CountryAreaName;
    }

    /**
     * Set Country or region.
     * @param CountryAreaName Country or region.
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
     * Get Occurrences of 2xx error codes. 
     * @return Code2xx Occurrences of 2xx error codes.
     */
    public Long getCode2xx() {
        return this.Code2xx;
    }

    /**
     * Set Occurrences of 2xx error codes.
     * @param Code2xx Occurrences of 2xx error codes.
     */
    public void setCode2xx(Long Code2xx) {
        this.Code2xx = Code2xx;
    }

    /**
     * Get Occurrences of 3xx error codes. 
     * @return Code3xx Occurrences of 3xx error codes.
     */
    public Long getCode3xx() {
        return this.Code3xx;
    }

    /**
     * Set Occurrences of 3xx error codes.
     * @param Code3xx Occurrences of 3xx error codes.
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

    public ProIspPlayCodeDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProIspPlayCodeDataInfo(ProIspPlayCodeDataInfo source) {
        if (source.CountryAreaName != null) {
            this.CountryAreaName = new String(source.CountryAreaName);
        }
        if (source.ProvinceName != null) {
            this.ProvinceName = new String(source.ProvinceName);
        }
        if (source.IspName != null) {
            this.IspName = new String(source.IspName);
        }
        if (source.Code2xx != null) {
            this.Code2xx = new Long(source.Code2xx);
        }
        if (source.Code3xx != null) {
            this.Code3xx = new Long(source.Code3xx);
        }
        if (source.Code4xx != null) {
            this.Code4xx = new Long(source.Code4xx);
        }
        if (source.Code5xx != null) {
            this.Code5xx = new Long(source.Code5xx);
        }
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

