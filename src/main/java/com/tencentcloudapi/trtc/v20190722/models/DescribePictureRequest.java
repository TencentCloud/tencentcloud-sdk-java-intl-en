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

public class DescribePictureRequest extends AbstractModel{

    /**
    * Application ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * Image ID. If it is left empty, the IDs of all images under the application are returned.
    */
    @SerializedName("PictureId")
    @Expose
    private Long PictureId;

    /**
    * Number of records per page. `10` is used if it is left empty.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Page number. `1` is used if it is left empty.
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
     * Get Application ID 
     * @return SdkAppId Application ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set Application ID
     * @param SdkAppId Application ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get Image ID. If it is left empty, the IDs of all images under the application are returned. 
     * @return PictureId Image ID. If it is left empty, the IDs of all images under the application are returned.
     */
    public Long getPictureId() {
        return this.PictureId;
    }

    /**
     * Set Image ID. If it is left empty, the IDs of all images under the application are returned.
     * @param PictureId Image ID. If it is left empty, the IDs of all images under the application are returned.
     */
    public void setPictureId(Long PictureId) {
        this.PictureId = PictureId;
    }

    /**
     * Get Number of records per page. `10` is used if it is left empty. 
     * @return PageSize Number of records per page. `10` is used if it is left empty.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of records per page. `10` is used if it is left empty.
     * @param PageSize Number of records per page. `10` is used if it is left empty.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Page number. `1` is used if it is left empty. 
     * @return PageNo Page number. `1` is used if it is left empty.
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set Page number. `1` is used if it is left empty.
     * @param PageNo Page number. `1` is used if it is left empty.
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    public DescribePictureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePictureRequest(DescribePictureRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PictureId != null) {
            this.PictureId = new Long(source.PictureId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PictureId", this.PictureId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);

    }
}

