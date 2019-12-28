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

public class ImportImageRequest extends AbstractModel{

    /**
    * OS architecture of the image to be imported, `x86_64` or `i386`.
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * OS type of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * OS version of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * Address on COS where the image to be imported is stored.
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * Image name
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * Image description
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * Dry run to check the parameters without performing the operation
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * Whether to force import the image. For more information, see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849).
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get OS architecture of the image to be imported, `x86_64` or `i386`. 
     * @return Architecture OS architecture of the image to be imported, `x86_64` or `i386`.
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set OS architecture of the image to be imported, `x86_64` or `i386`.
     * @param Architecture OS architecture of the image to be imported, `x86_64` or `i386`.
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get OS type of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems. 
     * @return OsType OS type of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set OS type of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     * @param OsType OS type of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get OS version of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems. 
     * @return OsVersion OS version of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set OS version of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     * @param OsVersion OS version of the image to be imported. You can call `DescribeImportImageOs` to obtain the list of supported operating systems.
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get Address on COS where the image to be imported is stored. 
     * @return ImageUrl Address on COS where the image to be imported is stored.
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set Address on COS where the image to be imported is stored.
     * @param ImageUrl Address on COS where the image to be imported is stored.
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get Image name 
     * @return ImageName Image name
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set Image name
     * @param ImageName Image name
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get Image description 
     * @return ImageDescription Image description
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set Image description
     * @param ImageDescription Image description
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get Dry run to check the parameters without performing the operation 
     * @return DryRun Dry run to check the parameters without performing the operation
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Dry run to check the parameters without performing the operation
     * @param DryRun Dry run to check the parameters without performing the operation
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get Whether to force import the image. For more information, see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849). 
     * @return Force Whether to force import the image. For more information, see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849).
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to force import the image. For more information, see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849).
     * @param Force Whether to force import the image. For more information, see [Forcibly Import Image](https://intl.cloud.tencent.com/document/product/213/12849).
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

