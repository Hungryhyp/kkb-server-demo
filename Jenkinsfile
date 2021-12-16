library('delivery')
library('kkb-k8s-mos-deploy-plugin')

delivery {
    apply plugin: "flow"
    apply plugin: "kkb_k8s_mos_deploy"

    config {
        category = ""
        name = "hk_server_b"
        release_repo  = "hk_foundation_web/hk_server_b"
        newArch = false
        subdir = ""
        version = "1.0.0-${env.COMMIT_ID}"
        k8s_namespaces = ["dev": "kkb-dev","test":"kkb-test","prod":"kkb-plat-prod"]
    }
}