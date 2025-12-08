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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraryExtension extends AbstractModel {

    /**
    * Specifies whether it is a file type media library that can store any type of file (true) or a media type media library that can only store images and playable video types (false). defaults to false. cannot be modified once created.
    */
    @SerializedName("IsFileLibrary")
    @Expose
    private Boolean IsFileLibrary;

    /**
    * true indicates a multi-tenant space media library, allowing the creation of multiple tenant spaces. false indicates a single-tenant space media library, where tenant spaces cannot be created and only the default single tenant space can be used. defaults to false. cannot be modified after the media library is created.
    */
    @SerializedName("IsMultiSpace")
    @Expose
    private Boolean IsMultiSpace;

    /**
    * Specifies the storage type for files saved to cloud object storage. valid values: STANDARD, STANDARD_IA, INTELLIGENT_TIERING, MAZ_STANDARD, MAZ_STANDARD_IA, and MAZ_INTELLIGENT_TIERING. defaults to STANDARD. when using a multi-AZ bucket, MAZ_ prefixed storage types for multi-AZ are automatically used, otherwise non-MAZ_ prefixed storage types for non-multi-AZ are used. when specifying INTELLIGENT TIERING storage INTELLIGENT_TIERING or MAZ_INTELLIGENT_TIERING, the bucket must have INTELLIGENT TIERING storage enabled beforehand, otherwise failure will be returned. cannot be modified after the media library is created.
    */
    @SerializedName("CosStorageClass")
    @Expose
    private String CosStorageClass;

    /**
    * Specifies whether the recycle bin feature is enabled. defaults to false.
    */
    @SerializedName("UseRecycleBin")
    @Expose
    private Boolean UseRecycleBin;

    /**
    * Specifies the number of days to automatically delete items in the recycle bin when enabled, must not exceed 1095 (3 years). a value of 0 indicates no automatic deletion, defaults to 0. this property is null when the recycle bin is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRemoveRecycledDays")
    @Expose
    private Long AutoRemoveRecycledDays;

    /**
    * Whether to enable the file path search feature. is false by default.
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * Specifies whether to deny the configuration request when setting the space quota for a media library or tenant and the quota is less than the used storage capacity. is false by default.
    */
    @SerializedName("DenyOnQuotaLessThanUsage")
    @Expose
    private Boolean DenyOnQuotaLessThanUsage;

    /**
    * Specifies whether the earlier version is enabled. defaults to false.
    */
    @SerializedName("EnableFileHistory")
    @Expose
    private Boolean EnableFileHistory;

    /**
    * Specifies the maximum number of historical versions to retain for a single file when versioning is enabled, with a value range of 1 to 999. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileHistoryCount")
    @Expose
    private Long FileHistoryCount;

    /**
    * Specifies the maximum days to retain earlier versions when versioning is enabled, with a value range of 0 to 999. when set to 0, it represents permanent retention. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileHistoryExpireDay")
    @Expose
    private Long FileHistoryExpireDay;

    /**
    * The maximum length of a directory or file name must not exceed 255, with a default value of 255. modifying this parameter will not affect existing directories or file names. if the value of this field is decreased, the length of existing directories or file names exceeding the target value does not change.
    */
    @SerializedName("MaxDirFileNameLength")
    @Expose
    private Long MaxDirFileNameLength;

    /**
    * Whether public read is enabled. once enabled, read operations require no access token. it is false by default. this property is supported only in single-tenant space media libraries. otherwise, it is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPublicRead")
    @Expose
    private Boolean IsPublicRead;

    /**
    * Specifies whether the multi-album feature is enabled for the media type media library. once enabled, first-level directories (albums) can be created, and media files can only be saved in these albums. unless enabled, albums cannot be created, and media files can only be saved in the root directory. defaults to false. this property is only supported for single-tenant space media type media libraries, otherwise it is null. cannot be modified after the media library is created.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsMultiAlbum")
    @Expose
    private Boolean IsMultiAlbum;

    /**
    * Specifies whether the media library of the media type allows image uploads, set to true by default. this property is supported only for the media library of the media type in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowPhoto")
    @Expose
    private Boolean AllowPhoto;

    /**
    * Specifies the allowed extensions when the media type media library allows photo uploads. empty array by default. at this point, it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries. otherwise, the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowPhotoExtName")
    @Expose
    private String [] AllowPhotoExtName;

    /**
    * Media type media library specifies whether video upload is allowed, set to true by default. this property is supported only in single tenant space media type media library, otherwise the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowVideo")
    @Expose
    private Boolean AllowVideo;

    /**
    * Specifies the allowed extensions when the media type media library permits video uploads. the default is an empty array, at which point it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowVideoExtName")
    @Expose
    private String [] AllowVideoExtName;

    /**
    * Specifies the file extensions allowed in the file type media library, empty by default. at this point, all types of files are upload allowed. this property is supported only for the file type media library in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AllowFileExtName")
    @Expose
    private String [] AllowFileExtName;

    /**
    * Specifies whether to perform sensitive content identification during image upload. the value is false by default. this property is supported only in the single-tenant space media library, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RecognizeSensitiveContent")
    @Expose
    private Boolean RecognizeSensitiveContent;

    /**
     * Get Specifies whether it is a file type media library that can store any type of file (true) or a media type media library that can only store images and playable video types (false). defaults to false. cannot be modified once created. 
     * @return IsFileLibrary Specifies whether it is a file type media library that can store any type of file (true) or a media type media library that can only store images and playable video types (false). defaults to false. cannot be modified once created.
     */
    public Boolean getIsFileLibrary() {
        return this.IsFileLibrary;
    }

    /**
     * Set Specifies whether it is a file type media library that can store any type of file (true) or a media type media library that can only store images and playable video types (false). defaults to false. cannot be modified once created.
     * @param IsFileLibrary Specifies whether it is a file type media library that can store any type of file (true) or a media type media library that can only store images and playable video types (false). defaults to false. cannot be modified once created.
     */
    public void setIsFileLibrary(Boolean IsFileLibrary) {
        this.IsFileLibrary = IsFileLibrary;
    }

    /**
     * Get true indicates a multi-tenant space media library, allowing the creation of multiple tenant spaces. false indicates a single-tenant space media library, where tenant spaces cannot be created and only the default single tenant space can be used. defaults to false. cannot be modified after the media library is created. 
     * @return IsMultiSpace true indicates a multi-tenant space media library, allowing the creation of multiple tenant spaces. false indicates a single-tenant space media library, where tenant spaces cannot be created and only the default single tenant space can be used. defaults to false. cannot be modified after the media library is created.
     */
    public Boolean getIsMultiSpace() {
        return this.IsMultiSpace;
    }

    /**
     * Set true indicates a multi-tenant space media library, allowing the creation of multiple tenant spaces. false indicates a single-tenant space media library, where tenant spaces cannot be created and only the default single tenant space can be used. defaults to false. cannot be modified after the media library is created.
     * @param IsMultiSpace true indicates a multi-tenant space media library, allowing the creation of multiple tenant spaces. false indicates a single-tenant space media library, where tenant spaces cannot be created and only the default single tenant space can be used. defaults to false. cannot be modified after the media library is created.
     */
    public void setIsMultiSpace(Boolean IsMultiSpace) {
        this.IsMultiSpace = IsMultiSpace;
    }

    /**
     * Get Specifies the storage type for files saved to cloud object storage. valid values: STANDARD, STANDARD_IA, INTELLIGENT_TIERING, MAZ_STANDARD, MAZ_STANDARD_IA, and MAZ_INTELLIGENT_TIERING. defaults to STANDARD. when using a multi-AZ bucket, MAZ_ prefixed storage types for multi-AZ are automatically used, otherwise non-MAZ_ prefixed storage types for non-multi-AZ are used. when specifying INTELLIGENT TIERING storage INTELLIGENT_TIERING or MAZ_INTELLIGENT_TIERING, the bucket must have INTELLIGENT TIERING storage enabled beforehand, otherwise failure will be returned. cannot be modified after the media library is created. 
     * @return CosStorageClass Specifies the storage type for files saved to cloud object storage. valid values: STANDARD, STANDARD_IA, INTELLIGENT_TIERING, MAZ_STANDARD, MAZ_STANDARD_IA, and MAZ_INTELLIGENT_TIERING. defaults to STANDARD. when using a multi-AZ bucket, MAZ_ prefixed storage types for multi-AZ are automatically used, otherwise non-MAZ_ prefixed storage types for non-multi-AZ are used. when specifying INTELLIGENT TIERING storage INTELLIGENT_TIERING or MAZ_INTELLIGENT_TIERING, the bucket must have INTELLIGENT TIERING storage enabled beforehand, otherwise failure will be returned. cannot be modified after the media library is created.
     */
    public String getCosStorageClass() {
        return this.CosStorageClass;
    }

    /**
     * Set Specifies the storage type for files saved to cloud object storage. valid values: STANDARD, STANDARD_IA, INTELLIGENT_TIERING, MAZ_STANDARD, MAZ_STANDARD_IA, and MAZ_INTELLIGENT_TIERING. defaults to STANDARD. when using a multi-AZ bucket, MAZ_ prefixed storage types for multi-AZ are automatically used, otherwise non-MAZ_ prefixed storage types for non-multi-AZ are used. when specifying INTELLIGENT TIERING storage INTELLIGENT_TIERING or MAZ_INTELLIGENT_TIERING, the bucket must have INTELLIGENT TIERING storage enabled beforehand, otherwise failure will be returned. cannot be modified after the media library is created.
     * @param CosStorageClass Specifies the storage type for files saved to cloud object storage. valid values: STANDARD, STANDARD_IA, INTELLIGENT_TIERING, MAZ_STANDARD, MAZ_STANDARD_IA, and MAZ_INTELLIGENT_TIERING. defaults to STANDARD. when using a multi-AZ bucket, MAZ_ prefixed storage types for multi-AZ are automatically used, otherwise non-MAZ_ prefixed storage types for non-multi-AZ are used. when specifying INTELLIGENT TIERING storage INTELLIGENT_TIERING or MAZ_INTELLIGENT_TIERING, the bucket must have INTELLIGENT TIERING storage enabled beforehand, otherwise failure will be returned. cannot be modified after the media library is created.
     */
    public void setCosStorageClass(String CosStorageClass) {
        this.CosStorageClass = CosStorageClass;
    }

    /**
     * Get Specifies whether the recycle bin feature is enabled. defaults to false. 
     * @return UseRecycleBin Specifies whether the recycle bin feature is enabled. defaults to false.
     */
    public Boolean getUseRecycleBin() {
        return this.UseRecycleBin;
    }

    /**
     * Set Specifies whether the recycle bin feature is enabled. defaults to false.
     * @param UseRecycleBin Specifies whether the recycle bin feature is enabled. defaults to false.
     */
    public void setUseRecycleBin(Boolean UseRecycleBin) {
        this.UseRecycleBin = UseRecycleBin;
    }

    /**
     * Get Specifies the number of days to automatically delete items in the recycle bin when enabled, must not exceed 1095 (3 years). a value of 0 indicates no automatic deletion, defaults to 0. this property is null when the recycle bin is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRemoveRecycledDays Specifies the number of days to automatically delete items in the recycle bin when enabled, must not exceed 1095 (3 years). a value of 0 indicates no automatic deletion, defaults to 0. this property is null when the recycle bin is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getAutoRemoveRecycledDays() {
        return this.AutoRemoveRecycledDays;
    }

    /**
     * Set Specifies the number of days to automatically delete items in the recycle bin when enabled, must not exceed 1095 (3 years). a value of 0 indicates no automatic deletion, defaults to 0. this property is null when the recycle bin is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRemoveRecycledDays Specifies the number of days to automatically delete items in the recycle bin when enabled, must not exceed 1095 (3 years). a value of 0 indicates no automatic deletion, defaults to 0. this property is null when the recycle bin is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRemoveRecycledDays(Long AutoRemoveRecycledDays) {
        this.AutoRemoveRecycledDays = AutoRemoveRecycledDays;
    }

    /**
     * Get Whether to enable the file path search feature. is false by default. 
     * @return EnableSearch Whether to enable the file path search feature. is false by default.
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set Whether to enable the file path search feature. is false by default.
     * @param EnableSearch Whether to enable the file path search feature. is false by default.
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get Specifies whether to deny the configuration request when setting the space quota for a media library or tenant and the quota is less than the used storage capacity. is false by default. 
     * @return DenyOnQuotaLessThanUsage Specifies whether to deny the configuration request when setting the space quota for a media library or tenant and the quota is less than the used storage capacity. is false by default.
     */
    public Boolean getDenyOnQuotaLessThanUsage() {
        return this.DenyOnQuotaLessThanUsage;
    }

    /**
     * Set Specifies whether to deny the configuration request when setting the space quota for a media library or tenant and the quota is less than the used storage capacity. is false by default.
     * @param DenyOnQuotaLessThanUsage Specifies whether to deny the configuration request when setting the space quota for a media library or tenant and the quota is less than the used storage capacity. is false by default.
     */
    public void setDenyOnQuotaLessThanUsage(Boolean DenyOnQuotaLessThanUsage) {
        this.DenyOnQuotaLessThanUsage = DenyOnQuotaLessThanUsage;
    }

    /**
     * Get Specifies whether the earlier version is enabled. defaults to false. 
     * @return EnableFileHistory Specifies whether the earlier version is enabled. defaults to false.
     */
    public Boolean getEnableFileHistory() {
        return this.EnableFileHistory;
    }

    /**
     * Set Specifies whether the earlier version is enabled. defaults to false.
     * @param EnableFileHistory Specifies whether the earlier version is enabled. defaults to false.
     */
    public void setEnableFileHistory(Boolean EnableFileHistory) {
        this.EnableFileHistory = EnableFileHistory;
    }

    /**
     * Get Specifies the maximum number of historical versions to retain for a single file when versioning is enabled, with a value range of 1 to 999. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileHistoryCount Specifies the maximum number of historical versions to retain for a single file when versioning is enabled, with a value range of 1 to 999. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileHistoryCount() {
        return this.FileHistoryCount;
    }

    /**
     * Set Specifies the maximum number of historical versions to retain for a single file when versioning is enabled, with a value range of 1 to 999. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileHistoryCount Specifies the maximum number of historical versions to retain for a single file when versioning is enabled, with a value range of 1 to 999. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileHistoryCount(Long FileHistoryCount) {
        this.FileHistoryCount = FileHistoryCount;
    }

    /**
     * Get Specifies the maximum days to retain earlier versions when versioning is enabled, with a value range of 0 to 999. when set to 0, it represents permanent retention. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileHistoryExpireDay Specifies the maximum days to retain earlier versions when versioning is enabled, with a value range of 0 to 999. when set to 0, it represents permanent retention. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFileHistoryExpireDay() {
        return this.FileHistoryExpireDay;
    }

    /**
     * Set Specifies the maximum days to retain earlier versions when versioning is enabled, with a value range of 0 to 999. when set to 0, it represents permanent retention. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileHistoryExpireDay Specifies the maximum days to retain earlier versions when versioning is enabled, with a value range of 0 to 999. when set to 0, it represents permanent retention. this property may be null when versioning is not enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileHistoryExpireDay(Long FileHistoryExpireDay) {
        this.FileHistoryExpireDay = FileHistoryExpireDay;
    }

    /**
     * Get The maximum length of a directory or file name must not exceed 255, with a default value of 255. modifying this parameter will not affect existing directories or file names. if the value of this field is decreased, the length of existing directories or file names exceeding the target value does not change. 
     * @return MaxDirFileNameLength The maximum length of a directory or file name must not exceed 255, with a default value of 255. modifying this parameter will not affect existing directories or file names. if the value of this field is decreased, the length of existing directories or file names exceeding the target value does not change.
     */
    public Long getMaxDirFileNameLength() {
        return this.MaxDirFileNameLength;
    }

    /**
     * Set The maximum length of a directory or file name must not exceed 255, with a default value of 255. modifying this parameter will not affect existing directories or file names. if the value of this field is decreased, the length of existing directories or file names exceeding the target value does not change.
     * @param MaxDirFileNameLength The maximum length of a directory or file name must not exceed 255, with a default value of 255. modifying this parameter will not affect existing directories or file names. if the value of this field is decreased, the length of existing directories or file names exceeding the target value does not change.
     */
    public void setMaxDirFileNameLength(Long MaxDirFileNameLength) {
        this.MaxDirFileNameLength = MaxDirFileNameLength;
    }

    /**
     * Get Whether public read is enabled. once enabled, read operations require no access token. it is false by default. this property is supported only in single-tenant space media libraries. otherwise, it is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPublicRead Whether public read is enabled. once enabled, read operations require no access token. it is false by default. this property is supported only in single-tenant space media libraries. otherwise, it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPublicRead() {
        return this.IsPublicRead;
    }

    /**
     * Set Whether public read is enabled. once enabled, read operations require no access token. it is false by default. this property is supported only in single-tenant space media libraries. otherwise, it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPublicRead Whether public read is enabled. once enabled, read operations require no access token. it is false by default. this property is supported only in single-tenant space media libraries. otherwise, it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPublicRead(Boolean IsPublicRead) {
        this.IsPublicRead = IsPublicRead;
    }

    /**
     * Get Specifies whether the multi-album feature is enabled for the media type media library. once enabled, first-level directories (albums) can be created, and media files can only be saved in these albums. unless enabled, albums cannot be created, and media files can only be saved in the root directory. defaults to false. this property is only supported for single-tenant space media type media libraries, otherwise it is null. cannot be modified after the media library is created.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsMultiAlbum Specifies whether the multi-album feature is enabled for the media type media library. once enabled, first-level directories (albums) can be created, and media files can only be saved in these albums. unless enabled, albums cannot be created, and media files can only be saved in the root directory. defaults to false. this property is only supported for single-tenant space media type media libraries, otherwise it is null. cannot be modified after the media library is created.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsMultiAlbum() {
        return this.IsMultiAlbum;
    }

    /**
     * Set Specifies whether the multi-album feature is enabled for the media type media library. once enabled, first-level directories (albums) can be created, and media files can only be saved in these albums. unless enabled, albums cannot be created, and media files can only be saved in the root directory. defaults to false. this property is only supported for single-tenant space media type media libraries, otherwise it is null. cannot be modified after the media library is created.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsMultiAlbum Specifies whether the multi-album feature is enabled for the media type media library. once enabled, first-level directories (albums) can be created, and media files can only be saved in these albums. unless enabled, albums cannot be created, and media files can only be saved in the root directory. defaults to false. this property is only supported for single-tenant space media type media libraries, otherwise it is null. cannot be modified after the media library is created.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsMultiAlbum(Boolean IsMultiAlbum) {
        this.IsMultiAlbum = IsMultiAlbum;
    }

    /**
     * Get Specifies whether the media library of the media type allows image uploads, set to true by default. this property is supported only for the media library of the media type in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowPhoto Specifies whether the media library of the media type allows image uploads, set to true by default. this property is supported only for the media library of the media type in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAllowPhoto() {
        return this.AllowPhoto;
    }

    /**
     * Set Specifies whether the media library of the media type allows image uploads, set to true by default. this property is supported only for the media library of the media type in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowPhoto Specifies whether the media library of the media type allows image uploads, set to true by default. this property is supported only for the media library of the media type in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowPhoto(Boolean AllowPhoto) {
        this.AllowPhoto = AllowPhoto;
    }

    /**
     * Get Specifies the allowed extensions when the media type media library allows photo uploads. empty array by default. at this point, it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries. otherwise, the property is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowPhotoExtName Specifies the allowed extensions when the media type media library allows photo uploads. empty array by default. at this point, it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries. otherwise, the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllowPhotoExtName() {
        return this.AllowPhotoExtName;
    }

    /**
     * Set Specifies the allowed extensions when the media type media library allows photo uploads. empty array by default. at this point, it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries. otherwise, the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowPhotoExtName Specifies the allowed extensions when the media type media library allows photo uploads. empty array by default. at this point, it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries. otherwise, the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowPhotoExtName(String [] AllowPhotoExtName) {
        this.AllowPhotoExtName = AllowPhotoExtName;
    }

    /**
     * Get Media type media library specifies whether video upload is allowed, set to true by default. this property is supported only in single tenant space media type media library, otherwise the property is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowVideo Media type media library specifies whether video upload is allowed, set to true by default. this property is supported only in single tenant space media type media library, otherwise the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAllowVideo() {
        return this.AllowVideo;
    }

    /**
     * Set Media type media library specifies whether video upload is allowed, set to true by default. this property is supported only in single tenant space media type media library, otherwise the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowVideo Media type media library specifies whether video upload is allowed, set to true by default. this property is supported only in single tenant space media type media library, otherwise the property is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowVideo(Boolean AllowVideo) {
        this.AllowVideo = AllowVideo;
    }

    /**
     * Get Specifies the allowed extensions when the media type media library permits video uploads. the default is an empty array, at which point it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowVideoExtName Specifies the allowed extensions when the media type media library permits video uploads. the default is an empty array, at which point it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllowVideoExtName() {
        return this.AllowVideoExtName;
    }

    /**
     * Set Specifies the allowed extensions when the media type media library permits video uploads. the default is an empty array, at which point it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowVideoExtName Specifies the allowed extensions when the media type media library permits video uploads. the default is an empty array, at which point it will automatically determine based on the MIME type corresponding to the file extension. this property is supported only for single-tenant space media type media libraries, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowVideoExtName(String [] AllowVideoExtName) {
        this.AllowVideoExtName = AllowVideoExtName;
    }

    /**
     * Get Specifies the file extensions allowed in the file type media library, empty by default. at this point, all types of files are upload allowed. this property is supported only for the file type media library in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AllowFileExtName Specifies the file extensions allowed in the file type media library, empty by default. at this point, all types of files are upload allowed. this property is supported only for the file type media library in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getAllowFileExtName() {
        return this.AllowFileExtName;
    }

    /**
     * Set Specifies the file extensions allowed in the file type media library, empty by default. at this point, all types of files are upload allowed. this property is supported only for the file type media library in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AllowFileExtName Specifies the file extensions allowed in the file type media library, empty by default. at this point, all types of files are upload allowed. this property is supported only for the file type media library in a single tenant space, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAllowFileExtName(String [] AllowFileExtName) {
        this.AllowFileExtName = AllowFileExtName;
    }

    /**
     * Get Specifies whether to perform sensitive content identification during image upload. the value is false by default. this property is supported only in the single-tenant space media library, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RecognizeSensitiveContent Specifies whether to perform sensitive content identification during image upload. the value is false by default. this property is supported only in the single-tenant space media library, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getRecognizeSensitiveContent() {
        return this.RecognizeSensitiveContent;
    }

    /**
     * Set Specifies whether to perform sensitive content identification during image upload. the value is false by default. this property is supported only in the single-tenant space media library, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RecognizeSensitiveContent Specifies whether to perform sensitive content identification during image upload. the value is false by default. this property is supported only in the single-tenant space media library, otherwise it is null.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRecognizeSensitiveContent(Boolean RecognizeSensitiveContent) {
        this.RecognizeSensitiveContent = RecognizeSensitiveContent;
    }

    public LibraryExtension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraryExtension(LibraryExtension source) {
        if (source.IsFileLibrary != null) {
            this.IsFileLibrary = new Boolean(source.IsFileLibrary);
        }
        if (source.IsMultiSpace != null) {
            this.IsMultiSpace = new Boolean(source.IsMultiSpace);
        }
        if (source.CosStorageClass != null) {
            this.CosStorageClass = new String(source.CosStorageClass);
        }
        if (source.UseRecycleBin != null) {
            this.UseRecycleBin = new Boolean(source.UseRecycleBin);
        }
        if (source.AutoRemoveRecycledDays != null) {
            this.AutoRemoveRecycledDays = new Long(source.AutoRemoveRecycledDays);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.DenyOnQuotaLessThanUsage != null) {
            this.DenyOnQuotaLessThanUsage = new Boolean(source.DenyOnQuotaLessThanUsage);
        }
        if (source.EnableFileHistory != null) {
            this.EnableFileHistory = new Boolean(source.EnableFileHistory);
        }
        if (source.FileHistoryCount != null) {
            this.FileHistoryCount = new Long(source.FileHistoryCount);
        }
        if (source.FileHistoryExpireDay != null) {
            this.FileHistoryExpireDay = new Long(source.FileHistoryExpireDay);
        }
        if (source.MaxDirFileNameLength != null) {
            this.MaxDirFileNameLength = new Long(source.MaxDirFileNameLength);
        }
        if (source.IsPublicRead != null) {
            this.IsPublicRead = new Boolean(source.IsPublicRead);
        }
        if (source.IsMultiAlbum != null) {
            this.IsMultiAlbum = new Boolean(source.IsMultiAlbum);
        }
        if (source.AllowPhoto != null) {
            this.AllowPhoto = new Boolean(source.AllowPhoto);
        }
        if (source.AllowPhotoExtName != null) {
            this.AllowPhotoExtName = new String[source.AllowPhotoExtName.length];
            for (int i = 0; i < source.AllowPhotoExtName.length; i++) {
                this.AllowPhotoExtName[i] = new String(source.AllowPhotoExtName[i]);
            }
        }
        if (source.AllowVideo != null) {
            this.AllowVideo = new Boolean(source.AllowVideo);
        }
        if (source.AllowVideoExtName != null) {
            this.AllowVideoExtName = new String[source.AllowVideoExtName.length];
            for (int i = 0; i < source.AllowVideoExtName.length; i++) {
                this.AllowVideoExtName[i] = new String(source.AllowVideoExtName[i]);
            }
        }
        if (source.AllowFileExtName != null) {
            this.AllowFileExtName = new String[source.AllowFileExtName.length];
            for (int i = 0; i < source.AllowFileExtName.length; i++) {
                this.AllowFileExtName[i] = new String(source.AllowFileExtName[i]);
            }
        }
        if (source.RecognizeSensitiveContent != null) {
            this.RecognizeSensitiveContent = new Boolean(source.RecognizeSensitiveContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFileLibrary", this.IsFileLibrary);
        this.setParamSimple(map, prefix + "IsMultiSpace", this.IsMultiSpace);
        this.setParamSimple(map, prefix + "CosStorageClass", this.CosStorageClass);
        this.setParamSimple(map, prefix + "UseRecycleBin", this.UseRecycleBin);
        this.setParamSimple(map, prefix + "AutoRemoveRecycledDays", this.AutoRemoveRecycledDays);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "DenyOnQuotaLessThanUsage", this.DenyOnQuotaLessThanUsage);
        this.setParamSimple(map, prefix + "EnableFileHistory", this.EnableFileHistory);
        this.setParamSimple(map, prefix + "FileHistoryCount", this.FileHistoryCount);
        this.setParamSimple(map, prefix + "FileHistoryExpireDay", this.FileHistoryExpireDay);
        this.setParamSimple(map, prefix + "MaxDirFileNameLength", this.MaxDirFileNameLength);
        this.setParamSimple(map, prefix + "IsPublicRead", this.IsPublicRead);
        this.setParamSimple(map, prefix + "IsMultiAlbum", this.IsMultiAlbum);
        this.setParamSimple(map, prefix + "AllowPhoto", this.AllowPhoto);
        this.setParamArraySimple(map, prefix + "AllowPhotoExtName.", this.AllowPhotoExtName);
        this.setParamSimple(map, prefix + "AllowVideo", this.AllowVideo);
        this.setParamArraySimple(map, prefix + "AllowVideoExtName.", this.AllowVideoExtName);
        this.setParamArraySimple(map, prefix + "AllowFileExtName.", this.AllowFileExtName);
        this.setParamSimple(map, prefix + "RecognizeSensitiveContent", this.RecognizeSensitiveContent);

    }
}

