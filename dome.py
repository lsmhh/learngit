
import json
import random
import time
import datetime as datetime
import requests
import urllib3
import datetime
urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)
#模拟安卓型号
headers = {
'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36 MicroMessenger/7.0.9.501 NetType/WIFI MiniProgramEnv/Windows WindowsWechat'
}
#需要抓取的网站
url = 'https://j1.pupuapi.com/client/product/storeproduct/detail/deef1dd8-65ee-46bc-9e18-8cf1478a67e9/439173e5-c6ec-43b1-be29-b465c6858575'



def getPupu():
    results = requests.get(url, headers=headers, verify=False)
    return results

results = getPupu()
res = results.json()
sanping = res['data']['name']
guige = res['data']['spec']
jiage = res['data']['price']
yuanjia = res['data']['market_price']
# 输出
print("-------------------商品: "+sanping+"-------------------------------")
print("规格: "+guige)
print("价格: "+str(jiage))
print("原价/折扣价: "+str(yuanjia)+"/"+str(jiage) )
print("-------------------------商品: "+sanping+"的价格波动--------------------------------")

if __name__ == '__main__':
    while (1):
        result = getPupu()
        jiage = res['data']['price']
        time = str(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S'))
        print("当前时间为" +time+ ", 价格为" + str(jiage))
