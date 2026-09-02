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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRegistryScanSubTaskInfo extends AbstractModel {

    /**
    * <p>Task sub-id</p>
    */
    @SerializedName("SubTaskId")
    @Expose
    private Long SubTaskId;

    /**
    * <p>Image ID.</p>
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * <p>Image name.</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>Image tag</p>
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * <p>Task status</p><p>Enumeration values:</p><ul><li>FINISHED: Scan complete</li><li>SCANNING: Scanning</li><li>CANCELLED: Canceled</li><li>SCAN_EXCEPTION: Scan exception</li></ul>
    */
    @SerializedName("ScanStatus")
    @Expose
    private String ScanStatus;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("FailedReason")
    @Expose
    private String FailedReason;

    /**
    * <p>Solution.</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>Account name of the scheduled task</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>uin of the account associated with the scheduled task</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>appid of the account associated with the scheduled task</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>Whether it is the newest image</p>
    */
    @SerializedName("IsLatestImage")
    @Expose
    private Boolean IsLatestImage;

    /**
    * <p>Image address</p>
    */
    @SerializedName("ImageRepoAddress")
    @Expose
    private String ImageRepoAddress;

    /**
    * <p>Image repository type</p>
    */
    @SerializedName("RegistryType")
    @Expose
    private String RegistryType;

    /**
     * Get <p>Task sub-id</p> 
     * @return SubTaskId <p>Task sub-id</p>
     */
    public Long getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set <p>Task sub-id</p>
     * @param SubTaskId <p>Task sub-id</p>
     */
    public void setSubTaskId(Long SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    /**
     * Get <p>Image ID.</p> 
     * @return ImageId <p>Image ID.</p>
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set <p>Image ID.</p>
     * @param ImageId <p>Image ID.</p>
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get <p>Image name.</p> 
     * @return ImageName <p>Image name.</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>Image name.</p>
     * @param ImageName <p>Image name.</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>Image tag</p> 
     * @return ImageTag <p>Image tag</p>
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set <p>Image tag</p>
     * @param ImageTag <p>Image tag</p>
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get <p>Task status</p><p>Enumeration values:</p><ul><li>FINISHED: Scan complete</li><li>SCANNING: Scanning</li><li>CANCELLED: Canceled</li><li>SCAN_EXCEPTION: Scan exception</li></ul> 
     * @return ScanStatus <p>Task status</p><p>Enumeration values:</p><ul><li>FINISHED: Scan complete</li><li>SCANNING: Scanning</li><li>CANCELLED: Canceled</li><li>SCAN_EXCEPTION: Scan exception</li></ul>
     */
    public String getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set <p>Task status</p><p>Enumeration values:</p><ul><li>FINISHED: Scan complete</li><li>SCANNING: Scanning</li><li>CANCELLED: Canceled</li><li>SCAN_EXCEPTION: Scan exception</li></ul>
     * @param ScanStatus <p>Task status</p><p>Enumeration values:</p><ul><li>FINISHED: Scan complete</li><li>SCANNING: Scanning</li><li>CANCELLED: Canceled</li><li>SCAN_EXCEPTION: Scan exception</li></ul>
     */
    public void setScanStatus(String ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return FailedReason <p>Failure reason</p>
     */
    public String getFailedReason() {
        return this.FailedReason;
    }

    /**
     * Set <p>Failure reason</p>
     * @param FailedReason <p>Failure reason</p>
     */
    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    /**
     * Get <p>Solution.</p> 
     * @return Solution <p>Solution.</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>Solution.</p>
     * @param Solution <p>Solution.</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>Account name of the scheduled task</p> 
     * @return OwnerAccountName <p>Account name of the scheduled task</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>Account name of the scheduled task</p>
     * @param OwnerAccountName <p>Account name of the scheduled task</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>uin of the account associated with the scheduled task</p> 
     * @return OwnerUin <p>uin of the account associated with the scheduled task</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>uin of the account associated with the scheduled task</p>
     * @param OwnerUin <p>uin of the account associated with the scheduled task</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>appid of the account associated with the scheduled task</p> 
     * @return OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>appid of the account associated with the scheduled task</p>
     * @param OwnerAppId <p>appid of the account associated with the scheduled task</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>Whether it is the newest image</p> 
     * @return IsLatestImage <p>Whether it is the newest image</p>
     */
    public Boolean getIsLatestImage() {
        return this.IsLatestImage;
    }

    /**
     * Set <p>Whether it is the newest image</p>
     * @param IsLatestImage <p>Whether it is the newest image</p>
     */
    public void setIsLatestImage(Boolean IsLatestImage) {
        this.IsLatestImage = IsLatestImage;
    }

    /**
     * Get <p>Image address</p> 
     * @return ImageRepoAddress <p>Image address</p>
     */
    public String getImageRepoAddress() {
        return this.ImageRepoAddress;
    }

    /**
     * Set <p>Image address</p>
     * @param ImageRepoAddress <p>Image address</p>
     */
    public void setImageRepoAddress(String ImageRepoAddress) {
        this.ImageRepoAddress = ImageRepoAddress;
    }

    /**
     * Get <p>Image repository type</p> 
     * @return RegistryType <p>Image repository type</p>
     */
    public String getRegistryType() {
        return this.RegistryType;
    }

    /**
     * Set <p>Image repository type</p>
     * @param RegistryType <p>Image repository type</p>
     */
    public void setRegistryType(String RegistryType) {
        this.RegistryType = RegistryType;
    }

    public ImageRegistryScanSubTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryScanSubTaskInfo(ImageRegistryScanSubTaskInfo source) {
        if (source.SubTaskId != null) {
            this.SubTaskId = new Long(source.SubTaskId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new String(source.ScanStatus);
        }
        if (source.FailedReason != null) {
            this.FailedReason = new String(source.FailedReason);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.IsLatestImage != null) {
            this.IsLatestImage = new Boolean(source.IsLatestImage);
        }
        if (source.ImageRepoAddress != null) {
            this.ImageRepoAddress = new String(source.ImageRepoAddress);
        }
        if (source.RegistryType != null) {
            this.RegistryType = new String(source.RegistryType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "FailedReason", this.FailedReason);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "IsLatestImage", this.IsLatestImage);
        this.setParamSimple(map, prefix + "ImageRepoAddress", this.ImageRepoAddress);
        this.setParamSimple(map, prefix + "RegistryType", this.RegistryType);

    }
}

