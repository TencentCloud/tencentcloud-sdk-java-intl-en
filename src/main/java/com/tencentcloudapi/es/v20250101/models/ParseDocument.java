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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseDocument extends AbstractModel {

    /**
    * Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Another supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Other maximum 20M
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * File storage on Tencent Cloud's URL ensures higher download speed and stability by using Tencent Cloud COS file address.
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is no more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
Either FileUrl or FileContent of the file must be provided. If both are provided, only FileUrl is used.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * Document parsing configuration
    */
    @SerializedName("DocumentParseConfig")
    @Expose
    private DocumentParseConfig DocumentParseConfig;

    /**
    * Starting page number of the document
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * End page number of the document
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
     * Get Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Another supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Other maximum 20M 
     * @return FileType Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Another supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Other maximum 20M
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Another supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Other maximum 20M
     * @param FileType Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Another supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Other maximum 20M
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get File storage on Tencent Cloud's URL ensures higher download speed and stability by using Tencent Cloud COS file address. 
     * @return FileUrl File storage on Tencent Cloud's URL ensures higher download speed and stability by using Tencent Cloud COS file address.
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set File storage on Tencent Cloud's URL ensures higher download speed and stability by using Tencent Cloud COS file address.
     * @param FileUrl File storage on Tencent Cloud's URL ensures higher download speed and stability by using Tencent Cloud COS file address.
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is no more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
Either FileUrl or FileContent of the file must be provided. If both are provided, only FileUrl is used. 
     * @return FileContent base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is no more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
Either FileUrl or FileContent of the file must be provided. If both are provided, only FileUrl is used.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is no more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
Either FileUrl or FileContent of the file must be provided. If both are provided, only FileUrl is used.
     * @param FileContent base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is no more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
Either FileUrl or FileContent of the file must be provided. If both are provided, only FileUrl is used.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get Document parsing configuration 
     * @return DocumentParseConfig Document parsing configuration
     */
    public DocumentParseConfig getDocumentParseConfig() {
        return this.DocumentParseConfig;
    }

    /**
     * Set Document parsing configuration
     * @param DocumentParseConfig Document parsing configuration
     */
    public void setDocumentParseConfig(DocumentParseConfig DocumentParseConfig) {
        this.DocumentParseConfig = DocumentParseConfig;
    }

    /**
     * Get Starting page number of the document 
     * @return FileStartPageNumber Starting page number of the document
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set Starting page number of the document
     * @param FileStartPageNumber Starting page number of the document
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get End page number of the document 
     * @return FileEndPageNumber End page number of the document
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set End page number of the document
     * @param FileEndPageNumber End page number of the document
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    public ParseDocument() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseDocument(ParseDocument source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.DocumentParseConfig != null) {
            this.DocumentParseConfig = new DocumentParseConfig(source.DocumentParseConfig);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamObj(map, prefix + "DocumentParseConfig.", this.DocumentParseConfig);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);

    }
}

