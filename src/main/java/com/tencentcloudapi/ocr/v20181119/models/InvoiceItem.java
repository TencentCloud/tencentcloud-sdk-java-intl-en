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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvoiceItem extends AbstractModel{

    /**
    * The recognition result.
`OK`: Recognition is successful.
`FailedOperation.UnsupportedInvoice`: Recognition is not supported.
`FailedOperation.UnKnowError`: Recognition failed.
For the information about other error codes, see the OCR API description for each invoice/ticket.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * The type of invoice/ticket to which the recognized image belongs.
-1: Unknown
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transportation
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales invoice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * The coordinates of the four vertices of the rotated image.
    */
    @SerializedName("Polygon")
    @Expose
    private Polygon Polygon;

    /**
    * The rotation angle of the recognized image in the image with multiple types of invoices/tickets.
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * The recognized content.
    */
    @SerializedName("SingleInvoiceInfos")
    @Expose
    private SingleInvoiceItem SingleInvoiceInfos;

    /**
    * The number of the page on which the recognized invoice is in the image or PDF file, starting from 1 by default.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * The detailed invoice type. See the description of `SubType`.
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * The invoice description. See the description of `TypeDescription`.
    */
    @SerializedName("TypeDescription")
    @Expose
    private String TypeDescription;

    /**
    * The image file after cropping, encoded in Base64. This is returned if `EnableCutImage` is set to `true`.
    */
    @SerializedName("CutImage")
    @Expose
    private String CutImage;

    /**
    * The description of the detailed invoice type. See the description of `SubType`.
    */
    @SerializedName("SubTypeDescription")
    @Expose
    private String SubTypeDescription;

    /**
     * Get The recognition result.
`OK`: Recognition is successful.
`FailedOperation.UnsupportedInvoice`: Recognition is not supported.
`FailedOperation.UnKnowError`: Recognition failed.
For the information about other error codes, see the OCR API description for each invoice/ticket. 
     * @return Code The recognition result.
`OK`: Recognition is successful.
`FailedOperation.UnsupportedInvoice`: Recognition is not supported.
`FailedOperation.UnKnowError`: Recognition failed.
For the information about other error codes, see the OCR API description for each invoice/ticket.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set The recognition result.
`OK`: Recognition is successful.
`FailedOperation.UnsupportedInvoice`: Recognition is not supported.
`FailedOperation.UnKnowError`: Recognition failed.
For the information about other error codes, see the OCR API description for each invoice/ticket.
     * @param Code The recognition result.
`OK`: Recognition is successful.
`FailedOperation.UnsupportedInvoice`: Recognition is not supported.
`FailedOperation.UnKnowError`: Recognition failed.
For the information about other error codes, see the OCR API description for each invoice/ticket.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get The type of invoice/ticket to which the recognized image belongs.
-1: Unknown
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transportation
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales invoice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice 
     * @return Type The type of invoice/ticket to which the recognized image belongs.
-1: Unknown
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transportation
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales invoice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set The type of invoice/ticket to which the recognized image belongs.
-1: Unknown
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transportation
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales invoice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
     * @param Type The type of invoice/ticket to which the recognized image belongs.
-1: Unknown
0: Taxi receipt
1: Quota invoice
2: Train ticket
3: VAT invoice
5: Itinerary/Receipt of e-ticket for air transportation
8: General machine-printed invoice
9: Bus ticket
10: Ship ticket
11: VAT invoice (roll)
12: Car sales invoice
13: Toll receipt
15: Non-tax revenue invoice
16: Fully digitalized electronic invoice
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get The coordinates of the four vertices of the rotated image. 
     * @return Polygon The coordinates of the four vertices of the rotated image.
     */
    public Polygon getPolygon() {
        return this.Polygon;
    }

    /**
     * Set The coordinates of the four vertices of the rotated image.
     * @param Polygon The coordinates of the four vertices of the rotated image.
     */
    public void setPolygon(Polygon Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get The rotation angle of the recognized image in the image with multiple types of invoices/tickets. 
     * @return Angle The rotation angle of the recognized image in the image with multiple types of invoices/tickets.
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set The rotation angle of the recognized image in the image with multiple types of invoices/tickets.
     * @param Angle The rotation angle of the recognized image in the image with multiple types of invoices/tickets.
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get The recognized content. 
     * @return SingleInvoiceInfos The recognized content.
     */
    public SingleInvoiceItem getSingleInvoiceInfos() {
        return this.SingleInvoiceInfos;
    }

    /**
     * Set The recognized content.
     * @param SingleInvoiceInfos The recognized content.
     */
    public void setSingleInvoiceInfos(SingleInvoiceItem SingleInvoiceInfos) {
        this.SingleInvoiceInfos = SingleInvoiceInfos;
    }

    /**
     * Get The number of the page on which the recognized invoice is in the image or PDF file, starting from 1 by default. 
     * @return Page The number of the page on which the recognized invoice is in the image or PDF file, starting from 1 by default.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set The number of the page on which the recognized invoice is in the image or PDF file, starting from 1 by default.
     * @param Page The number of the page on which the recognized invoice is in the image or PDF file, starting from 1 by default.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get The detailed invoice type. See the description of `SubType`. 
     * @return SubType The detailed invoice type. See the description of `SubType`.
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set The detailed invoice type. See the description of `SubType`.
     * @param SubType The detailed invoice type. See the description of `SubType`.
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get The invoice description. See the description of `TypeDescription`. 
     * @return TypeDescription The invoice description. See the description of `TypeDescription`.
     */
    public String getTypeDescription() {
        return this.TypeDescription;
    }

    /**
     * Set The invoice description. See the description of `TypeDescription`.
     * @param TypeDescription The invoice description. See the description of `TypeDescription`.
     */
    public void setTypeDescription(String TypeDescription) {
        this.TypeDescription = TypeDescription;
    }

    /**
     * Get The image file after cropping, encoded in Base64. This is returned if `EnableCutImage` is set to `true`. 
     * @return CutImage The image file after cropping, encoded in Base64. This is returned if `EnableCutImage` is set to `true`.
     */
    public String getCutImage() {
        return this.CutImage;
    }

    /**
     * Set The image file after cropping, encoded in Base64. This is returned if `EnableCutImage` is set to `true`.
     * @param CutImage The image file after cropping, encoded in Base64. This is returned if `EnableCutImage` is set to `true`.
     */
    public void setCutImage(String CutImage) {
        this.CutImage = CutImage;
    }

    /**
     * Get The description of the detailed invoice type. See the description of `SubType`. 
     * @return SubTypeDescription The description of the detailed invoice type. See the description of `SubType`.
     */
    public String getSubTypeDescription() {
        return this.SubTypeDescription;
    }

    /**
     * Set The description of the detailed invoice type. See the description of `SubType`.
     * @param SubTypeDescription The description of the detailed invoice type. See the description of `SubType`.
     */
    public void setSubTypeDescription(String SubTypeDescription) {
        this.SubTypeDescription = SubTypeDescription;
    }

    public InvoiceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvoiceItem(InvoiceItem source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Polygon != null) {
            this.Polygon = new Polygon(source.Polygon);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.SingleInvoiceInfos != null) {
            this.SingleInvoiceInfos = new SingleInvoiceItem(source.SingleInvoiceInfos);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.TypeDescription != null) {
            this.TypeDescription = new String(source.TypeDescription);
        }
        if (source.CutImage != null) {
            this.CutImage = new String(source.CutImage);
        }
        if (source.SubTypeDescription != null) {
            this.SubTypeDescription = new String(source.SubTypeDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamObj(map, prefix + "SingleInvoiceInfos.", this.SingleInvoiceInfos);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "TypeDescription", this.TypeDescription);
        this.setParamSimple(map, prefix + "CutImage", this.CutImage);
        this.setParamSimple(map, prefix + "SubTypeDescription", this.SubTypeDescription);

    }
}

