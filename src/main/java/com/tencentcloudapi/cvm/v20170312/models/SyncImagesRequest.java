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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncImagesRequest extends AbstractModel{

    /**
    * List of image IDs. You can obtain the image IDs in two ways: <br><li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response. <br><li>Find the image IDs in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified images must meet the following requirement: <br><li>the images must be in the `NORMAL` state. <br>For more information on image status, see [Image Data Table](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image).
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * List of destination regions for synchronization. Limits:<br><li>It cannot be the same as the source region.<br><li>The Region parameter is correct. See [Region](https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1).<br><li>Image synchronization is only available in limited regions.<br>

For a shared image, the destination region must be the source region, which indicates to create a copy of the image as a custom image in the same region.
    */
    @SerializedName("DestinationRegions")
    @Expose
    private String [] DestinationRegions;

    /**
    * Checks whether image synchronization can be initiated.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Destination image name.
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
     * Get List of image IDs. You can obtain the image IDs in two ways: <br><li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response. <br><li>Find the image IDs in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified images must meet the following requirement: <br><li>the images must be in the `NORMAL` state. <br>For more information on image status, see [Image Data Table](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image). 
     * @return ImageIds List of image IDs. You can obtain the image IDs in two ways: <br><li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response. <br><li>Find the image IDs in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified images must meet the following requirement: <br><li>the images must be in the `NORMAL` state. <br>For more information on image status, see [Image Data Table](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image).
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set List of image IDs. You can obtain the image IDs in two ways: <br><li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response. <br><li>Find the image IDs in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified images must meet the following requirement: <br><li>the images must be in the `NORMAL` state. <br>For more information on image status, see [Image Data Table](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image).
     * @param ImageIds List of image IDs. You can obtain the image IDs in two ways: <br><li>Call the [DescribeImages](https://intl.cloud.tencent.com/document/api/213/15715?from_cn_redirect=1) API and find the value of `ImageId` in the response. <br><li>Find the image IDs in the [Image Console](https://console.cloud.tencent.com/cvm/image). <br>The specified images must meet the following requirement: <br><li>the images must be in the `NORMAL` state. <br>For more information on image status, see [Image Data Table](https://intl.cloud.tencent.com/document/product/213/15753?from_cn_redirect=1#Image).
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get List of destination regions for synchronization. Limits:<br><li>It cannot be the same as the source region.<br><li>The Region parameter is correct. See [Region](https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1).<br><li>Image synchronization is only available in limited regions.<br>

For a shared image, the destination region must be the source region, which indicates to create a copy of the image as a custom image in the same region. 
     * @return DestinationRegions List of destination regions for synchronization. Limits:<br><li>It cannot be the same as the source region.<br><li>The Region parameter is correct. See [Region](https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1).<br><li>Image synchronization is only available in limited regions.<br>

For a shared image, the destination region must be the source region, which indicates to create a copy of the image as a custom image in the same region.
     */
    public String [] getDestinationRegions() {
        return this.DestinationRegions;
    }

    /**
     * Set List of destination regions for synchronization. Limits:<br><li>It cannot be the same as the source region.<br><li>The Region parameter is correct. See [Region](https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1).<br><li>Image synchronization is only available in limited regions.<br>

For a shared image, the destination region must be the source region, which indicates to create a copy of the image as a custom image in the same region.
     * @param DestinationRegions List of destination regions for synchronization. Limits:<br><li>It cannot be the same as the source region.<br><li>The Region parameter is correct. See [Region](https://intl.cloud.tencent.com/document/product/213/6091?from_cn_redirect=1).<br><li>Image synchronization is only available in limited regions.<br>

For a shared image, the destination region must be the source region, which indicates to create a copy of the image as a custom image in the same region.
     */
    public void setDestinationRegions(String [] DestinationRegions) {
        this.DestinationRegions = DestinationRegions;
    }

    /**
     * Get Checks whether image synchronization can be initiated. 
     * @return DryRun Checks whether image synchronization can be initiated.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Checks whether image synchronization can be initiated.
     * @param DryRun Checks whether image synchronization can be initiated.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Destination image name. 
     * @return ImageName Destination image name.
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Destination image name.
     * @param ImageName Destination image name.
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    public SyncImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncImagesRequest(SyncImagesRequest source) {
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.DestinationRegions != null) {
            this.DestinationRegions = new String[source.DestinationRegions.length];
            for (int i = 0; i < source.DestinationRegions.length; i++) {
                this.DestinationRegions[i] = new String(source.DestinationRegions[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamArraySimple(map, prefix + "DestinationRegions.", this.DestinationRegions);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);

    }
}

