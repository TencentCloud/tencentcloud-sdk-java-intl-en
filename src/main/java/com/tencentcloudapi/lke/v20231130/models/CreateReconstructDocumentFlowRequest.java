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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateReconstructDocumentFlowRequest extends AbstractModel {

    /**
    * File type. Supported file types: pdf, doc, docx, ppt, pptx, md, txt, xls, xlsx, csv, png, jpg, jpeg, bmp, gif, webp, heic, eps, icns, im, pcx, ppm, tiff, xbm, heif, jp2.
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * The base64 value of the file. File size limit: the downloaded file does not exceed 8m after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * <p>File URL. The file download time does not exceed 15 seconds. Supported image pixels: the length of a single side is between 20-10000px. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. The downloaded file shall not exceed the supported file size after Base64 encoding: </p><table> <tbody> <tr> <td>File Type</td> <td>Supported File Size</td> </tr> <tr> <td>PDF</td> <td>200M</td> </tr> <tr> <td>DOC</td> <td>200M</td> </tr> <tr> <td>DOCX</td> <td>200M</td> </tr> <tr> <td>PPT</td> <td>200M</td> </tr> <tr> <td>PPTX</td> <td>200M</td> </tr> <tr> <td>MD</td> <td>10M</td> </tr> <tr> <td>TXT</td> <td>10M</td> </tr> <tr> <td>XLS</td> <td>20M</td> </tr> <tr> <td>XLSX</td> <td>20M</td> </tr> <tr> <td>CSV</td> <td>20M</td> </tr> <tr> <td>PNG</td> <td>20M</td> </tr> <tr> <td>JPG</td> <td>20M</td> </tr> <tr> <td>JPEG</td> <td>20M</td> </tr> <tr> <td>BMP</td> <td>20M</td> </tr> <tr> <td>GIF</td> <td>20M</td> </tr> <tr> <td>WEBP</td> <td>20M</td> </tr> <tr> <td>HEIC</td> <td>20M</td> </tr> <tr> <td>EPS</td> <td>20M</td> </tr> <tr> <td>ICNS</td> <td>20M</td> </tr> <tr> <td>IM</td> <td>20M</td> </tr> <tr> <td>PCX</td> <td>20M</td> </tr> <tr> <td>PPM</td> <td>20M</td> </tr> <tr> <td>TIFF</td> <td>20M</td> </tr> <tr> <td>XBM</td> <td>20M</td> </tr> <tr> <td>HEIF</td> <td>20M</td> </tr> <tr> <td>JP2</td> <td>20M</td> </tr> </tbody> <colgroup> <col> <col> </colgroup></table>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for file recognition, including the current value. The default is 1, indicating recognition starts from the first page of the file.
    */
    @SerializedName("FileStartPageNumber")
    @Expose
    private Long FileStartPageNumber;

    /**
    * When type of the uploaded file is pdf, doc, docx, orppt, pptx, it specifies the end page number for file recognition, including the current value. The default is 100, indicating recognition up to page 100 of the file. a single call supports recognition of up to 1000 pages, i.e., FileEndPageNumber-FileStartPageNumber should be no more than 1000.
    */
    @SerializedName("FileEndPageNumber")
    @Expose
    private Long FileEndPageNumber;

    /**
    * Configuration information for creating a document parsing task.
    */
    @SerializedName("Config")
    @Expose
    private CreateReconstructDocumentFlowConfig Config;

    /**
     * Get File type. Supported file types: pdf, doc, docx, ppt, pptx, md, txt, xls, xlsx, csv, png, jpg, jpeg, bmp, gif, webp, heic, eps, icns, im, pcx, ppm, tiff, xbm, heif, jp2. 
     * @return FileType File type. Supported file types: pdf, doc, docx, ppt, pptx, md, txt, xls, xlsx, csv, png, jpg, jpeg, bmp, gif, webp, heic, eps, icns, im, pcx, ppm, tiff, xbm, heif, jp2.
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set File type. Supported file types: pdf, doc, docx, ppt, pptx, md, txt, xls, xlsx, csv, png, jpg, jpeg, bmp, gif, webp, heic, eps, icns, im, pcx, ppm, tiff, xbm, heif, jp2.
     * @param FileType File type. Supported file types: pdf, doc, docx, ppt, pptx, md, txt, xls, xlsx, csv, png, jpg, jpeg, bmp, gif, webp, heic, eps, icns, im, pcx, ppm, tiff, xbm, heif, jp2.
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get The base64 value of the file. File size limit: the downloaded file does not exceed 8m after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used. 
     * @return FileBase64 The base64 value of the file. File size limit: the downloaded file does not exceed 8m after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set The base64 value of the file. File size limit: the downloaded file does not exceed 8m after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     * @param FileBase64 The base64 value of the file. File size limit: the downloaded file does not exceed 8m after base64 encoding. File download time does not exceed 3 seconds. Supported image pixels: the length of a single side is between 20-10000px. Either FileUrl or FileBase64 of the file must be provided. If both are provided, only the FileUrl is used.
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get <p>File URL. The file download time does not exceed 15 seconds. Supported image pixels: the length of a single side is between 20-10000px. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. The downloaded file shall not exceed the supported file size after Base64 encoding: </p><table> <tbody> <tr> <td>File Type</td> <td>Supported File Size</td> </tr> <tr> <td>PDF</td> <td>200M</td> </tr> <tr> <td>DOC</td> <td>200M</td> </tr> <tr> <td>DOCX</td> <td>200M</td> </tr> <tr> <td>PPT</td> <td>200M</td> </tr> <tr> <td>PPTX</td> <td>200M</td> </tr> <tr> <td>MD</td> <td>10M</td> </tr> <tr> <td>TXT</td> <td>10M</td> </tr> <tr> <td>XLS</td> <td>20M</td> </tr> <tr> <td>XLSX</td> <td>20M</td> </tr> <tr> <td>CSV</td> <td>20M</td> </tr> <tr> <td>PNG</td> <td>20M</td> </tr> <tr> <td>JPG</td> <td>20M</td> </tr> <tr> <td>JPEG</td> <td>20M</td> </tr> <tr> <td>BMP</td> <td>20M</td> </tr> <tr> <td>GIF</td> <td>20M</td> </tr> <tr> <td>WEBP</td> <td>20M</td> </tr> <tr> <td>HEIC</td> <td>20M</td> </tr> <tr> <td>EPS</td> <td>20M</td> </tr> <tr> <td>ICNS</td> <td>20M</td> </tr> <tr> <td>IM</td> <td>20M</td> </tr> <tr> <td>PCX</td> <td>20M</td> </tr> <tr> <td>PPM</td> <td>20M</td> </tr> <tr> <td>TIFF</td> <td>20M</td> </tr> <tr> <td>XBM</td> <td>20M</td> </tr> <tr> <td>HEIF</td> <td>20M</td> </tr> <tr> <td>JP2</td> <td>20M</td> </tr> </tbody> <colgroup> <col> <col> </colgroup></table> 
     * @return FileUrl <p>File URL. The file download time does not exceed 15 seconds. Supported image pixels: the length of a single side is between 20-10000px. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. The downloaded file shall not exceed the supported file size after Base64 encoding: </p><table> <tbody> <tr> <td>File Type</td> <td>Supported File Size</td> </tr> <tr> <td>PDF</td> <td>200M</td> </tr> <tr> <td>DOC</td> <td>200M</td> </tr> <tr> <td>DOCX</td> <td>200M</td> </tr> <tr> <td>PPT</td> <td>200M</td> </tr> <tr> <td>PPTX</td> <td>200M</td> </tr> <tr> <td>MD</td> <td>10M</td> </tr> <tr> <td>TXT</td> <td>10M</td> </tr> <tr> <td>XLS</td> <td>20M</td> </tr> <tr> <td>XLSX</td> <td>20M</td> </tr> <tr> <td>CSV</td> <td>20M</td> </tr> <tr> <td>PNG</td> <td>20M</td> </tr> <tr> <td>JPG</td> <td>20M</td> </tr> <tr> <td>JPEG</td> <td>20M</td> </tr> <tr> <td>BMP</td> <td>20M</td> </tr> <tr> <td>GIF</td> <td>20M</td> </tr> <tr> <td>WEBP</td> <td>20M</td> </tr> <tr> <td>HEIC</td> <td>20M</td> </tr> <tr> <td>EPS</td> <td>20M</td> </tr> <tr> <td>ICNS</td> <td>20M</td> </tr> <tr> <td>IM</td> <td>20M</td> </tr> <tr> <td>PCX</td> <td>20M</td> </tr> <tr> <td>PPM</td> <td>20M</td> </tr> <tr> <td>TIFF</td> <td>20M</td> </tr> <tr> <td>XBM</td> <td>20M</td> </tr> <tr> <td>HEIF</td> <td>20M</td> </tr> <tr> <td>JP2</td> <td>20M</td> </tr> </tbody> <colgroup> <col> <col> </colgroup></table>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>File URL. The file download time does not exceed 15 seconds. Supported image pixels: the length of a single side is between 20-10000px. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. The downloaded file shall not exceed the supported file size after Base64 encoding: </p><table> <tbody> <tr> <td>File Type</td> <td>Supported File Size</td> </tr> <tr> <td>PDF</td> <td>200M</td> </tr> <tr> <td>DOC</td> <td>200M</td> </tr> <tr> <td>DOCX</td> <td>200M</td> </tr> <tr> <td>PPT</td> <td>200M</td> </tr> <tr> <td>PPTX</td> <td>200M</td> </tr> <tr> <td>MD</td> <td>10M</td> </tr> <tr> <td>TXT</td> <td>10M</td> </tr> <tr> <td>XLS</td> <td>20M</td> </tr> <tr> <td>XLSX</td> <td>20M</td> </tr> <tr> <td>CSV</td> <td>20M</td> </tr> <tr> <td>PNG</td> <td>20M</td> </tr> <tr> <td>JPG</td> <td>20M</td> </tr> <tr> <td>JPEG</td> <td>20M</td> </tr> <tr> <td>BMP</td> <td>20M</td> </tr> <tr> <td>GIF</td> <td>20M</td> </tr> <tr> <td>WEBP</td> <td>20M</td> </tr> <tr> <td>HEIC</td> <td>20M</td> </tr> <tr> <td>EPS</td> <td>20M</td> </tr> <tr> <td>ICNS</td> <td>20M</td> </tr> <tr> <td>IM</td> <td>20M</td> </tr> <tr> <td>PCX</td> <td>20M</td> </tr> <tr> <td>PPM</td> <td>20M</td> </tr> <tr> <td>TIFF</td> <td>20M</td> </tr> <tr> <td>XBM</td> <td>20M</td> </tr> <tr> <td>HEIF</td> <td>20M</td> </tr> <tr> <td>JP2</td> <td>20M</td> </tr> </tbody> <colgroup> <col> <col> </colgroup></table>
     * @param FileUrl <p>File URL. The file download time does not exceed 15 seconds. Supported image pixels: the length of a single side is between 20-10000px. It is recommended to store the file in Tencent Cloud as the URL where the file is stored in Tencent Cloud can ensure higher download speed and stability. External URL may affect the speed and stability. The downloaded file shall not exceed the supported file size after Base64 encoding: </p><table> <tbody> <tr> <td>File Type</td> <td>Supported File Size</td> </tr> <tr> <td>PDF</td> <td>200M</td> </tr> <tr> <td>DOC</td> <td>200M</td> </tr> <tr> <td>DOCX</td> <td>200M</td> </tr> <tr> <td>PPT</td> <td>200M</td> </tr> <tr> <td>PPTX</td> <td>200M</td> </tr> <tr> <td>MD</td> <td>10M</td> </tr> <tr> <td>TXT</td> <td>10M</td> </tr> <tr> <td>XLS</td> <td>20M</td> </tr> <tr> <td>XLSX</td> <td>20M</td> </tr> <tr> <td>CSV</td> <td>20M</td> </tr> <tr> <td>PNG</td> <td>20M</td> </tr> <tr> <td>JPG</td> <td>20M</td> </tr> <tr> <td>JPEG</td> <td>20M</td> </tr> <tr> <td>BMP</td> <td>20M</td> </tr> <tr> <td>GIF</td> <td>20M</td> </tr> <tr> <td>WEBP</td> <td>20M</td> </tr> <tr> <td>HEIC</td> <td>20M</td> </tr> <tr> <td>EPS</td> <td>20M</td> </tr> <tr> <td>ICNS</td> <td>20M</td> </tr> <tr> <td>IM</td> <td>20M</td> </tr> <tr> <td>PCX</td> <td>20M</td> </tr> <tr> <td>PPM</td> <td>20M</td> </tr> <tr> <td>TIFF</td> <td>20M</td> </tr> <tr> <td>XBM</td> <td>20M</td> </tr> <tr> <td>HEIF</td> <td>20M</td> </tr> <tr> <td>JP2</td> <td>20M</td> </tr> </tbody> <colgroup> <col> <col> </colgroup></table>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for file recognition, including the current value. The default is 1, indicating recognition starts from the first page of the file. 
     * @return FileStartPageNumber When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for file recognition, including the current value. The default is 1, indicating recognition starts from the first page of the file.
     */
    public Long getFileStartPageNumber() {
        return this.FileStartPageNumber;
    }

    /**
     * Set When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for file recognition, including the current value. The default is 1, indicating recognition starts from the first page of the file.
     * @param FileStartPageNumber When type of the uploaded file is pdf, doc, docx, ppt, or pptx, it specifies the starting page number for file recognition, including the current value. The default is 1, indicating recognition starts from the first page of the file.
     */
    public void setFileStartPageNumber(Long FileStartPageNumber) {
        this.FileStartPageNumber = FileStartPageNumber;
    }

    /**
     * Get When type of the uploaded file is pdf, doc, docx, orppt, pptx, it specifies the end page number for file recognition, including the current value. The default is 100, indicating recognition up to page 100 of the file. a single call supports recognition of up to 1000 pages, i.e., FileEndPageNumber-FileStartPageNumber should be no more than 1000. 
     * @return FileEndPageNumber When type of the uploaded file is pdf, doc, docx, orppt, pptx, it specifies the end page number for file recognition, including the current value. The default is 100, indicating recognition up to page 100 of the file. a single call supports recognition of up to 1000 pages, i.e., FileEndPageNumber-FileStartPageNumber should be no more than 1000.
     */
    public Long getFileEndPageNumber() {
        return this.FileEndPageNumber;
    }

    /**
     * Set When type of the uploaded file is pdf, doc, docx, orppt, pptx, it specifies the end page number for file recognition, including the current value. The default is 100, indicating recognition up to page 100 of the file. a single call supports recognition of up to 1000 pages, i.e., FileEndPageNumber-FileStartPageNumber should be no more than 1000.
     * @param FileEndPageNumber When type of the uploaded file is pdf, doc, docx, orppt, pptx, it specifies the end page number for file recognition, including the current value. The default is 100, indicating recognition up to page 100 of the file. a single call supports recognition of up to 1000 pages, i.e., FileEndPageNumber-FileStartPageNumber should be no more than 1000.
     */
    public void setFileEndPageNumber(Long FileEndPageNumber) {
        this.FileEndPageNumber = FileEndPageNumber;
    }

    /**
     * Get Configuration information for creating a document parsing task. 
     * @return Config Configuration information for creating a document parsing task.
     */
    public CreateReconstructDocumentFlowConfig getConfig() {
        return this.Config;
    }

    /**
     * Set Configuration information for creating a document parsing task.
     * @param Config Configuration information for creating a document parsing task.
     */
    public void setConfig(CreateReconstructDocumentFlowConfig Config) {
        this.Config = Config;
    }

    public CreateReconstructDocumentFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReconstructDocumentFlowRequest(CreateReconstructDocumentFlowRequest source) {
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileStartPageNumber != null) {
            this.FileStartPageNumber = new Long(source.FileStartPageNumber);
        }
        if (source.FileEndPageNumber != null) {
            this.FileEndPageNumber = new Long(source.FileEndPageNumber);
        }
        if (source.Config != null) {
            this.Config = new CreateReconstructDocumentFlowConfig(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileStartPageNumber", this.FileStartPageNumber);
        this.setParamSimple(map, prefix + "FileEndPageNumber", this.FileEndPageNumber);
        this.setParamObj(map, prefix + "Config.", this.Config);

    }
}

