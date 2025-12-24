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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReconstructDocumentSSERequest extends AbstractModel {

    /**
    * File type.
**Supported file types**: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS, XLSX, CSV, PNG, JPG, JPEG, BMP, GIF, WEBP, HEIC, EPS, ICNS, IM, PCX, PPM, TIFF, XBM, HEIF, JP2.
**Supported file sizes**: 
- Max 100 MB for PDF, DOC, DOCX, PPT, and PPTX .
- Max 10 MB for MD, TXT, XLS, XLSX, and CSV.
- Max20 MB for others.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File URL. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. Refer to: [Tencent Cloud COS Documentation](https://www.tencentcloud.com/document/product/436/7749)
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * The starting page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for recognition, including the current value.
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * The end page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the end page number for recognition, including the current value.
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * Document parsing configuration information.	
    */
    @SerializedName("Config")
    @Expose
    private ReconstructDocumentSSEConfig Config;

    /**
     * Get File type.
**Supported file types**: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS, XLSX, CSV, PNG, JPG, JPEG, BMP, GIF, WEBP, HEIC, EPS, ICNS, IM, PCX, PPM, TIFF, XBM, HEIF, JP2.
**Supported file sizes**: 
- Max 100 MB for PDF, DOC, DOCX, PPT, and PPTX .
- Max 10 MB for MD, TXT, XLS, XLSX, and CSV.
- Max20 MB for others. 
     * @return FileType File type.
**Supported file types**: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS, XLSX, CSV, PNG, JPG, JPEG, BMP, GIF, WEBP, HEIC, EPS, ICNS, IM, PCX, PPM, TIFF, XBM, HEIF, JP2.
**Supported file sizes**: 
- Max 100 MB for PDF, DOC, DOCX, PPT, and PPTX .
- Max 10 MB for MD, TXT, XLS, XLSX, and CSV.
- Max20 MB for others.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type.
**Supported file types**: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS, XLSX, CSV, PNG, JPG, JPEG, BMP, GIF, WEBP, HEIC, EPS, ICNS, IM, PCX, PPM, TIFF, XBM, HEIF, JP2.
**Supported file sizes**: 
- Max 100 MB for PDF, DOC, DOCX, PPT, and PPTX .
- Max 10 MB for MD, TXT, XLS, XLSX, and CSV.
- Max20 MB for others.
     * @param FileType File type.
**Supported file types**: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS, XLSX, CSV, PNG, JPG, JPEG, BMP, GIF, WEBP, HEIC, EPS, ICNS, IM, PCX, PPM, TIFF, XBM, HEIF, JP2.
**Supported file sizes**: 
- Max 100 MB for PDF, DOC, DOCX, PPT, and PPTX .
- Max 10 MB for MD, TXT, XLS, XLSX, and CSV.
- Max20 MB for others.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File URL. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. Refer to: [Tencent Cloud COS Documentation](https://www.tencentcloud.com/document/product/436/7749) 
     * @return FileUrl File URL. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. Refer to: [Tencent Cloud COS Documentation](https://www.tencentcloud.com/document/product/436/7749)
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set File URL. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. Refer to: [Tencent Cloud COS Documentation](https://www.tencentcloud.com/document/product/436/7749)
     * @param FileUrl File URL. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. Refer to: [Tencent Cloud COS Documentation](https://www.tencentcloud.com/document/product/436/7749)
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used. 
     * @return FileBase64 The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     * @param FileBase64 The base64 value of the file. File size limit: the downloaded file shall not exceed 8MB after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get The starting page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for recognition, including the current value. 
     * @return FileStartPageNumber The starting page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for recognition, including the current value.
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set The starting page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for recognition, including the current value.
     * @param FileStartPageNumber The starting page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for recognition, including the current value.
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get The end page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the end page number for recognition, including the current value. 
     * @return FileEndPageNumber The end page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the end page number for recognition, including the current value.
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set The end page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the end page number for recognition, including the current value.
     * @param FileEndPageNumber The end page number of the file. When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the end page number for recognition, including the current value.
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get Document parsing configuration information.	 
     * @return Config Document parsing configuration information.	
     */
    public ReconstructDocumentSSEConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Document parsing configuration information.	
     * @param Config Document parsing configuration information.	
     */
    public void setConfig(ReconstructDocumentSSEConfig Config) {
        this.Config = Config;
    }

    public ReconstructDocumentSSERequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReconstructDocumentSSERequest(ReconstructDocumentSSERequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.Config != null) {
            this.Config = new ReconstructDocumentSSEConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

