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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlResult extends AbstractModel {

    /**
    * Exception type. Valid values:
Jitter: jitter.
Blur: blurry.
LowLighting: low light.
HighLighting: overexposure.
CrashScreen: screen glitch.
BlackWhiteEdge: Black and white edges
SolidColorScreen: solid color screen.
Noise: noise.
Mosaic: Mosaic
QRCode: QR code.
AppletCode: Mini program code.
BarCode: barcode.
LowVoice: bass.
HighVoice: high voice detection.
NoVoice: mute.
LowEvaluation: The video no-reference score (MOS) is below the threshold.
AudioEvaluation: The audio no-reference scoring (MOS) is below the threshold.
AudioNoise: Audio noise.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Quality inspection result item.
    */
    @SerializedName("QualityControlItems")
    @Expose
    private QualityControlItem [] QualityControlItems;

    /**
     * Get Exception type. Valid values:
Jitter: jitter.
Blur: blurry.
LowLighting: low light.
HighLighting: overexposure.
CrashScreen: screen glitch.
BlackWhiteEdge: Black and white edges
SolidColorScreen: solid color screen.
Noise: noise.
Mosaic: Mosaic
QRCode: QR code.
AppletCode: Mini program code.
BarCode: barcode.
LowVoice: bass.
HighVoice: high voice detection.
NoVoice: mute.
LowEvaluation: The video no-reference score (MOS) is below the threshold.
AudioEvaluation: The audio no-reference scoring (MOS) is below the threshold.
AudioNoise: Audio noise. 
     * @return Type Exception type. Valid values:
Jitter: jitter.
Blur: blurry.
LowLighting: low light.
HighLighting: overexposure.
CrashScreen: screen glitch.
BlackWhiteEdge: Black and white edges
SolidColorScreen: solid color screen.
Noise: noise.
Mosaic: Mosaic
QRCode: QR code.
AppletCode: Mini program code.
BarCode: barcode.
LowVoice: bass.
HighVoice: high voice detection.
NoVoice: mute.
LowEvaluation: The video no-reference score (MOS) is below the threshold.
AudioEvaluation: The audio no-reference scoring (MOS) is below the threshold.
AudioNoise: Audio noise.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exception type. Valid values:
Jitter: jitter.
Blur: blurry.
LowLighting: low light.
HighLighting: overexposure.
CrashScreen: screen glitch.
BlackWhiteEdge: Black and white edges
SolidColorScreen: solid color screen.
Noise: noise.
Mosaic: Mosaic
QRCode: QR code.
AppletCode: Mini program code.
BarCode: barcode.
LowVoice: bass.
HighVoice: high voice detection.
NoVoice: mute.
LowEvaluation: The video no-reference score (MOS) is below the threshold.
AudioEvaluation: The audio no-reference scoring (MOS) is below the threshold.
AudioNoise: Audio noise.
     * @param Type Exception type. Valid values:
Jitter: jitter.
Blur: blurry.
LowLighting: low light.
HighLighting: overexposure.
CrashScreen: screen glitch.
BlackWhiteEdge: Black and white edges
SolidColorScreen: solid color screen.
Noise: noise.
Mosaic: Mosaic
QRCode: QR code.
AppletCode: Mini program code.
BarCode: barcode.
LowVoice: bass.
HighVoice: high voice detection.
NoVoice: mute.
LowEvaluation: The video no-reference score (MOS) is below the threshold.
AudioEvaluation: The audio no-reference scoring (MOS) is below the threshold.
AudioNoise: Audio noise.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Quality inspection result item. 
     * @return QualityControlItems Quality inspection result item.
     */
    public QualityControlItem [] getQualityControlItems() {
        return this.QualityControlItems;
    }

    /**
     * Set Quality inspection result item.
     * @param QualityControlItems Quality inspection result item.
     */
    public void setQualityControlItems(QualityControlItem [] QualityControlItems) {
        this.QualityControlItems = QualityControlItems;
    }

    public QualityControlResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlResult(QualityControlResult source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.QualityControlItems != null) {
            this.QualityControlItems = new QualityControlItem[source.QualityControlItems.length];
            for (int i = 0; i < source.QualityControlItems.length; i++) {
                this.QualityControlItems[i] = new QualityControlItem(source.QualityControlItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "QualityControlItems.", this.QualityControlItems);

    }
}

