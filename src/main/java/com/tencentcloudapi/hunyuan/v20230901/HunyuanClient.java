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
package com.tencentcloudapi.hunyuan.v20230901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.hunyuan.v20230901.models.*;

public class HunyuanClient extends AbstractClient{
    private static String endpoint = "hunyuan.intl.tencentcloudapi.com";
    private static String service = "hunyuan";
    private static String version = "2023-09-01";

    public HunyuanClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public HunyuanClient(Credential credential, String region, ClientProfile profile) {
        super(HunyuanClient.endpoint, HunyuanClient.version, credential, region, profile);
    }

    /**
     *Tencent Hunyuan is a large language model (LLM) developed by Tencent R&D. It possesses powerful Chinese creation capacity, logical reasoning in complex context, and reliable task execution power. This API supports streaming or non-streaming calls. When using streaming calls, it follows the SSE protocol.

1. This API does not currently support returning Image Content.
2. By default, this API has account restrictions with a number of concurrencies of 5. 
3. Please use the SDK to call this API. examples are provided in the Git repository examples/hunyuan/v20230901/ directory for each development language. The SDK link is provided in the "**Developer Resources - SDK**" part under the document.
4. We recommend you use API Explorer for quick online debugging interface and download example code in languages, [click to open](https://console.cloud.tencent.com/api/explorer?Product=hunyuan&Version=2023-09-01&Action=ChatCompletions).
     * @param req ChatTranslationsRequest
     * @return ChatTranslationsResponse
     * @throws TencentCloudSDKException
     */
    public ChatTranslationsResponse ChatTranslations(ChatTranslationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatTranslations", ChatTranslationsResponse.class);
    }

    /**
     *After inputting a 3D model file, the 3D model file format can be switched.
     * @param req Convert3DFormatRequest
     * @return Convert3DFormatResponse
     * @throws TencentCloudSDKException
     */
    public Convert3DFormatResponse Convert3DFormat(Convert3DFormatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Convert3DFormat", Convert3DFormatResponse.class);
    }

    /**
     *The SmartTopoly API uses the Polygon 1.5 model. After manually inputting a 3D high-poly model, it can generate a neat 3D model with lower polygon count.
1 concurrent is provided by default, which means 1 submitted task can be processed simultaneously. The next task can be processed only after the previous task is completed.
     * @param req Describe3DSmartTopologyJobRequest
     * @return Describe3DSmartTopologyJobResponse
     * @throws TencentCloudSDKException
     */
    public Describe3DSmartTopologyJobResponse Describe3DSmartTopologyJob(Describe3DSmartTopologyJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Describe3DSmartTopologyJob", Describe3DSmartTopologyJobResponse.class);
    }

    /**
     *This API is used to query the generation task of a component.
     * @param req QueryHunyuan3DPartJobRequest
     * @return QueryHunyuan3DPartJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuan3DPartJobResponse QueryHunyuan3DPartJob(QueryHunyuan3DPartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuan3DPartJob", QueryHunyuan3DPartJobResponse.class);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model and input text descriptions/images.
This API is used to provide 3 concurrent tasks by default, which can process 3 submitted tasks simultaneously. The next task can be processed only after the previous task is completed.
     * @param req QueryHunyuanTo3DProJobRequest
     * @return QueryHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DProJobResponse QueryHunyuanTo3DProJob(QueryHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DProJob", QueryHunyuanTo3DProJobResponse.class);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model with input text descriptions or images.
This API is used to provide 1 concurrent task by default, which means only 1 submitted task can be processed simultaneously. The next task can be processed only after the previous task is completed.
     * @param req QueryHunyuanTo3DRapidJobRequest
     * @return QueryHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public QueryHunyuanTo3DRapidJobResponse QueryHunyuanTo3DRapidJob(QueryHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryHunyuanTo3DRapidJob", QueryHunyuanTo3DRapidJobResponse.class);
    }

    /**
     *The SmartTopoly API uses the Polygen 1.5 model. After manually inputting a 3D high-poly model, it can generate a neat 3D model with lower polygon count.
1 concurrent is provided by default, which means 1 submitted task can be processed simultaneously. The next task can be processed only after the previous task is completed.
     * @param req Submit3DSmartTopologyJobRequest
     * @return Submit3DSmartTopologyJobResponse
     * @throws TencentCloudSDKException
     */
    public Submit3DSmartTopologyJobResponse Submit3DSmartTopologyJob(Submit3DSmartTopologyJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Submit3DSmartTopologyJob", Submit3DSmartTopologyJobResponse.class);
    }

    /**
     *This API is used to automatically perform component identification and generation based on the model structure after inputting a 3D model file.
     * @param req SubmitHunyuan3DPartJobRequest
     * @return SubmitHunyuan3DPartJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuan3DPartJobResponse SubmitHunyuan3DPartJob(SubmitHunyuan3DPartJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuan3DPartJob", SubmitHunyuan3DPartJobResponse.class);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model and input text descriptions/images.
This API is used to provide 3 concurrent tasks by default. Up to 3 submitted tasks can be processed simultaneously. A new task can be processed only after the previous one is completed.
     * @param req SubmitHunyuanTo3DProJobRequest
     * @return SubmitHunyuanTo3DProJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DProJobResponse SubmitHunyuanTo3DProJob(SubmitHunyuanTo3DProJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DProJob", SubmitHunyuanTo3DProJobResponse.class);
    }

    /**
     *This API is used to intelligently generate 3D content based on the HunYuan Large Model with input text descriptions or images.
This API is used to provide 1 concurrent task by default, which means only 1 submitted task can be processed simultaneously. The next task can be processed only after the previous task is completed.
     * @param req SubmitHunyuanTo3DRapidJobRequest
     * @return SubmitHunyuanTo3DRapidJobResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHunyuanTo3DRapidJobResponse SubmitHunyuanTo3DRapidJob(SubmitHunyuanTo3DRapidJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHunyuanTo3DRapidJob", SubmitHunyuanTo3DRapidJobResponse.class);
    }

}
