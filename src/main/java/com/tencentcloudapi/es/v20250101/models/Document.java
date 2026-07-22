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

public class Document extends AbstractModel {

    /**
    * Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Other supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Another maximum of 20M
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
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is not more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * File name, used when uploading with base64.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

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
-Other supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Another maximum of 20M 
     * @return FileType Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Other supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Another maximum of 20M
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
-Other supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Another maximum of 20M
     * @param FileType Supported file types: PDF, DOC, DOCX, PPT, PPTX, MD, TXT, XLS.
XLSX,CSV,PNG,JPG,JPEG,BMP,GIF,WEBP,HEIC,EPS,ICNS,
IM,PCX,PPM,TIFF,XBM,HEIF,JP2

Supported file size for document parsing:
-PDF, DOC, DOCX, PPT, PPTX support 100M.
-MD, TXT, XLS, XLSX, CSV support 10M.
-Other supports 20M

Supported file size for text slicing:
-Maximum PDF size: 300 MB
-D0CX, D0C, PPT, PPTX maximum 200M
-Maximum 10M for TXT, MD
-Another maximum of 20M
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
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is not more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px. 
     * @return FileContent base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is not more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is not more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
     * @param FileContent base64 value of the file, carrying the MineType prefix information. The encoded file is no more than 10M.
Supported file size: The downloaded file is no more than 8M after Base64 encoding. File download time is not more than 3 seconds.
Supported image pixel: Unilateral between 20-10000px.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get File name, used when uploading with base64. 
     * @return FileName File name, used when uploading with base64.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set File name, used when uploading with base64.
     * @param FileName File name, used when uploading with base64.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
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

    public Document() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Document(Document source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
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
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);

    }
}

