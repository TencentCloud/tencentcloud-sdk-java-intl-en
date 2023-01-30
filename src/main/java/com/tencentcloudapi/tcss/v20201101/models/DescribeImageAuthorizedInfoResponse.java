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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAuthorizedInfoResponse extends AbstractModel{

    /**
    * Total number of valid image licenses
    */
    @SerializedName("TotalAuthorizedCnt")
    @Expose
    private Long TotalAuthorizedCnt;

    /**
    * Number of used image licenses
    */
    @SerializedName("UsedAuthorizedCnt")
    @Expose
    private Long UsedAuthorizedCnt;

    /**
    * Number of images with scan enabled
    */
    @SerializedName("ScannedImageCnt")
    @Expose
    private Long ScannedImageCnt;

    /**
    * Number of images with scan not enabled
    */
    @SerializedName("NotScannedImageCnt")
    @Expose
    private Long NotScannedImageCnt;

    /**
    * Number of local images with scan not enabled
    */
    @SerializedName("NotScannedLocalImageCnt")
    @Expose
    private Long NotScannedLocalImageCnt;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of valid image licenses 
     * @return TotalAuthorizedCnt Total number of valid image licenses
     */
    public Long getTotalAuthorizedCnt() {
        return this.TotalAuthorizedCnt;
    }

    /**
     * Set Total number of valid image licenses
     * @param TotalAuthorizedCnt Total number of valid image licenses
     */
    public void setTotalAuthorizedCnt(Long TotalAuthorizedCnt) {
        this.TotalAuthorizedCnt = TotalAuthorizedCnt;
    }

    /**
     * Get Number of used image licenses 
     * @return UsedAuthorizedCnt Number of used image licenses
     */
    public Long getUsedAuthorizedCnt() {
        return this.UsedAuthorizedCnt;
    }

    /**
     * Set Number of used image licenses
     * @param UsedAuthorizedCnt Number of used image licenses
     */
    public void setUsedAuthorizedCnt(Long UsedAuthorizedCnt) {
        this.UsedAuthorizedCnt = UsedAuthorizedCnt;
    }

    /**
     * Get Number of images with scan enabled 
     * @return ScannedImageCnt Number of images with scan enabled
     */
    public Long getScannedImageCnt() {
        return this.ScannedImageCnt;
    }

    /**
     * Set Number of images with scan enabled
     * @param ScannedImageCnt Number of images with scan enabled
     */
    public void setScannedImageCnt(Long ScannedImageCnt) {
        this.ScannedImageCnt = ScannedImageCnt;
    }

    /**
     * Get Number of images with scan not enabled 
     * @return NotScannedImageCnt Number of images with scan not enabled
     */
    public Long getNotScannedImageCnt() {
        return this.NotScannedImageCnt;
    }

    /**
     * Set Number of images with scan not enabled
     * @param NotScannedImageCnt Number of images with scan not enabled
     */
    public void setNotScannedImageCnt(Long NotScannedImageCnt) {
        this.NotScannedImageCnt = NotScannedImageCnt;
    }

    /**
     * Get Number of local images with scan not enabled 
     * @return NotScannedLocalImageCnt Number of local images with scan not enabled
     */
    public Long getNotScannedLocalImageCnt() {
        return this.NotScannedLocalImageCnt;
    }

    /**
     * Set Number of local images with scan not enabled
     * @param NotScannedLocalImageCnt Number of local images with scan not enabled
     */
    public void setNotScannedLocalImageCnt(Long NotScannedLocalImageCnt) {
        this.NotScannedLocalImageCnt = NotScannedLocalImageCnt;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageAuthorizedInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAuthorizedInfoResponse(DescribeImageAuthorizedInfoResponse source) {
        if (source.TotalAuthorizedCnt != null) {
            this.TotalAuthorizedCnt = new Long(source.TotalAuthorizedCnt);
        }
        if (source.UsedAuthorizedCnt != null) {
            this.UsedAuthorizedCnt = new Long(source.UsedAuthorizedCnt);
        }
        if (source.ScannedImageCnt != null) {
            this.ScannedImageCnt = new Long(source.ScannedImageCnt);
        }
        if (source.NotScannedImageCnt != null) {
            this.NotScannedImageCnt = new Long(source.NotScannedImageCnt);
        }
        if (source.NotScannedLocalImageCnt != null) {
            this.NotScannedLocalImageCnt = new Long(source.NotScannedLocalImageCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalAuthorizedCnt", this.TotalAuthorizedCnt);
        this.setParamSimple(map, prefix + "UsedAuthorizedCnt", this.UsedAuthorizedCnt);
        this.setParamSimple(map, prefix + "ScannedImageCnt", this.ScannedImageCnt);
        this.setParamSimple(map, prefix + "NotScannedImageCnt", this.NotScannedImageCnt);
        this.setParamSimple(map, prefix + "NotScannedLocalImageCnt", this.NotScannedLocalImageCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

