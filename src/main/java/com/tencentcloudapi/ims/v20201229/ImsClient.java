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
package com.tencentcloudapi.ims.v20201229;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ims.v20201229.models.*;

public class ImsClient extends AbstractClient{
    private static String endpoint = "ims.intl.tencentcloudapi.com";
    private static String service = "ims";
    private static String version = "2020-12-29";

    public ImsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ImsClient(Credential credential, String region, ClientProfile profile) {
        super(ImsClient.endpoint, ImsClient.version, credential, region, profile);
    }

    /**
     *This API is used to submit an image for smart moderation. Before using it, you need to log in to the console with the Tencent Cloud root account [to activate IMS](https://console.cloud.tencent.com/cms/image/package) and adjust the business configuration.
### API use instructions
- Go to the "[CMS console - IMS](https://console.cloud.tencent.com/cms/image/package)" to activate IMS.
- This API is a paid API. For its billing mode, see [IMS Pricing](https://intl.cloud.tencent.com/product/ims/pricing?from_cn_redirect=1).

### API feature description
- It can detect images or links and recognize content that may be offensive, unsafe, or inappropriate based on the deep learning technology;
- It can capture frames from or split GIF/long images for detection;
- It can recognize various non-compliant scenarios, including vulgarity, law or regulation violations, pornography, and advertising;
- It can detect multiple types of objects (such as object, advertising logo, and QR code) and recognize text in images based on OCR;
- It allows you to customize moderation policies based on different business scenarios;
- You can select image risk libraries to filter non-compliant images of custom types (currently, only blocklist configuration is supported);
- You can associate account or device information when moderating an image to recognize the account or device involved.

### API call description
- Supported image file size: **< 5 MB**
- Supported image file resolution: **a resolution of 256x256 or higher** is recommended; otherwise, the recognition effect may be affected.
- Supported image file formats: PNG, JPG, JPEG, BMP, GIF, and WEBP.
- Supported image URL transfer protocols: HTTP and HTTPS.
- If you pass in the access URL of an image, you need to **limit the image download time to 3 seconds**. To ensure the stability and reliability of the image to be detected, we recommend you use Tencent Cloud COS for storage or CDN for caching.
- Default API request rate limit: **100 requests/sec**. If this limit is exceeded, an error will be reported.

<div class="rno-api-explorer" style="margin-bottom:20px">
    <div class="rno-api-explorer-inner">
        <div class="rno-api-explorer-hd">
            <div class="rno-api-explorer-title">
                </p>
            </div>
        </div>
    </div>
</div>
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ImageModeration", ImageModerationResponse.class);
    }

}
