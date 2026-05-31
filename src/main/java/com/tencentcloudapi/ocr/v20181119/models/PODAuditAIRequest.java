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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PODAuditAIRequest extends AbstractModel {

    /**
    * <p>The Base64 value of the image/PDF. The Base64 must be no more than 10M, resolution is recommended to be 600*800 or higher, and supports PNG, JPG, JPEG, BMP, PDF formats. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only use ImageUrl. Example value: /9j/4AAQSkZJRg.....s97n//2Q==</p>
    */
    @SerializedName("ImageBase64List")
    @Expose
    private String [] ImageBase64List;

    /**
    * <p>The Url address of the image/PDF. The image after Base64 encoding should be no more than 10M, with a resolution of 600*800 or higher, and supports PNG, JPG, JPEG, BMP, and PDF formats. The image download time should not exceed 3 seconds. Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of non-Tencent Cloud storage URLs may be impacted to a certain extent. Example value: https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.JPG</p>
    */
    @SerializedName("ImageUrlList")
    @Expose
    private String [] ImageUrlList;

    /**
    * <p>Waybill number is used for pod rule review assistance</p>
    */
    @SerializedName("WaybillNumber")
    @Expose
    private String WaybillNumber;

    /**
    * <p>No      The acknowledge type, 0 is selected by default</p><p>Enumeration value:</p><ul><li>0: Doorstep/yard</li><li>1: Parcel reception room</li><li>2: Myself/others acknowledge</li><li>3: Front desk/reception</li><li>4: Express delivery collection point</li><li>5: Express cabinet</li></ul>
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
     * Get <p>The Base64 value of the image/PDF. The Base64 must be no more than 10M, resolution is recommended to be 600*800 or higher, and supports PNG, JPG, JPEG, BMP, PDF formats. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only use ImageUrl. Example value: /9j/4AAQSkZJRg.....s97n//2Q==</p> 
     * @return ImageBase64List <p>The Base64 value of the image/PDF. The Base64 must be no more than 10M, resolution is recommended to be 600*800 or higher, and supports PNG, JPG, JPEG, BMP, PDF formats. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only use ImageUrl. Example value: /9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public String [] getImageBase64List() {
        return this.ImageBase64List;
    }

    /**
     * Set <p>The Base64 value of the image/PDF. The Base64 must be no more than 10M, resolution is recommended to be 600*800 or higher, and supports PNG, JPG, JPEG, BMP, PDF formats. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only use ImageUrl. Example value: /9j/4AAQSkZJRg.....s97n//2Q==</p>
     * @param ImageBase64List <p>The Base64 value of the image/PDF. The Base64 must be no more than 10M, resolution is recommended to be 600*800 or higher, and supports PNG, JPG, JPEG, BMP, PDF formats. Either ImageUrl or ImageBase64 of the image must be provided. If both are provided, only use ImageUrl. Example value: /9j/4AAQSkZJRg.....s97n//2Q==</p>
     */
    public void setImageBase64List(String [] ImageBase64List) {
        this.ImageBase64List = ImageBase64List;
    }

    /**
     * Get <p>The Url address of the image/PDF. The image after Base64 encoding should be no more than 10M, with a resolution of 600*800 or higher, and supports PNG, JPG, JPEG, BMP, and PDF formats. The image download time should not exceed 3 seconds. Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of non-Tencent Cloud storage URLs may be impacted to a certain extent. Example value: https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.JPG</p> 
     * @return ImageUrlList <p>The Url address of the image/PDF. The image after Base64 encoding should be no more than 10M, with a resolution of 600*800 or higher, and supports PNG, JPG, JPEG, BMP, and PDF formats. The image download time should not exceed 3 seconds. Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of non-Tencent Cloud storage URLs may be impacted to a certain extent. Example value: https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.JPG</p>
     */
    public String [] getImageUrlList() {
        return this.ImageUrlList;
    }

    /**
     * Set <p>The Url address of the image/PDF. The image after Base64 encoding should be no more than 10M, with a resolution of 600*800 or higher, and supports PNG, JPG, JPEG, BMP, and PDF formats. The image download time should not exceed 3 seconds. Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of non-Tencent Cloud storage URLs may be impacted to a certain extent. Example value: https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.JPG</p>
     * @param ImageUrlList <p>The Url address of the image/PDF. The image after Base64 encoding should be no more than 10M, with a resolution of 600*800 or higher, and supports PNG, JPG, JPEG, BMP, and PDF formats. The image download time should not exceed 3 seconds. Images stored in Tencent Cloud's Url can guarantee higher download speed and stability. It is recommended to store images in Tencent Cloud. The speed and stability of non-Tencent Cloud storage URLs may be impacted to a certain extent. Example value: https://ocr-demo-1254418846.cos.ap-guangzhou.myqcloud.com/general/GeneralAccurateOCR/GeneralAccurateOCR1.JPG</p>
     */
    public void setImageUrlList(String [] ImageUrlList) {
        this.ImageUrlList = ImageUrlList;
    }

    /**
     * Get <p>Waybill number is used for pod rule review assistance</p> 
     * @return WaybillNumber <p>Waybill number is used for pod rule review assistance</p>
     */
    public String getWaybillNumber() {
        return this.WaybillNumber;
    }

    /**
     * Set <p>Waybill number is used for pod rule review assistance</p>
     * @param WaybillNumber <p>Waybill number is used for pod rule review assistance</p>
     */
    public void setWaybillNumber(String WaybillNumber) {
        this.WaybillNumber = WaybillNumber;
    }

    /**
     * Get <p>No      The acknowledge type, 0 is selected by default</p><p>Enumeration value:</p><ul><li>0: Doorstep/yard</li><li>1: Parcel reception room</li><li>2: Myself/others acknowledge</li><li>3: Front desk/reception</li><li>4: Express delivery collection point</li><li>5: Express cabinet</li></ul> 
     * @return SignType <p>No      The acknowledge type, 0 is selected by default</p><p>Enumeration value:</p><ul><li>0: Doorstep/yard</li><li>1: Parcel reception room</li><li>2: Myself/others acknowledge</li><li>3: Front desk/reception</li><li>4: Express delivery collection point</li><li>5: Express cabinet</li></ul>
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set <p>No      The acknowledge type, 0 is selected by default</p><p>Enumeration value:</p><ul><li>0: Doorstep/yard</li><li>1: Parcel reception room</li><li>2: Myself/others acknowledge</li><li>3: Front desk/reception</li><li>4: Express delivery collection point</li><li>5: Express cabinet</li></ul>
     * @param SignType <p>No      The acknowledge type, 0 is selected by default</p><p>Enumeration value:</p><ul><li>0: Doorstep/yard</li><li>1: Parcel reception room</li><li>2: Myself/others acknowledge</li><li>3: Front desk/reception</li><li>4: Express delivery collection point</li><li>5: Express cabinet</li></ul>
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    public PODAuditAIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PODAuditAIRequest(PODAuditAIRequest source) {
        if (source.ImageBase64List != null) {
            this.ImageBase64List = new String[source.ImageBase64List.length];
            for (int i = 0; i < source.ImageBase64List.length; i++) {
                this.ImageBase64List[i] = new String(source.ImageBase64List[i]);
            }
        }
        if (source.ImageUrlList != null) {
            this.ImageUrlList = new String[source.ImageUrlList.length];
            for (int i = 0; i < source.ImageUrlList.length; i++) {
                this.ImageUrlList[i] = new String(source.ImageUrlList[i]);
            }
        }
        if (source.WaybillNumber != null) {
            this.WaybillNumber = new String(source.WaybillNumber);
        }
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageBase64List.", this.ImageBase64List);
        this.setParamArraySimple(map, prefix + "ImageUrlList.", this.ImageUrlList);
        this.setParamSimple(map, prefix + "WaybillNumber", this.WaybillNumber);
        this.setParamSimple(map, prefix + "SignType", this.SignType);

    }
}

